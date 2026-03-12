import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HtmlAnalyzer{
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = carregaHTML(args)){
            if (input == null) return;

            System.out.println("Utilizando Regex: ");
            String maiorNivelRegex = verificaHTMLRegex(input);

            if (maiorNivelRegex == null){
                System.out.println("malformed HTML ");
            } else{
                int length = maiorNivelRegex.length();
                String border = "+" + "-".repeat(length + 2) + "+";

                System.out.println("\n" + border);
                System.out.println("| " + maiorNivelRegex + " |");
                System.out.println(border + "\n");
            }
        }

        try (BufferedReader input = carregaHTML(args)){
            if (input == null) return;
            
            System.out.println("Utilizando Contadores: ");
            String maiorNivel = verificaHTML(input);

            if (maiorNivel == null){
                System.out.println("malformed HTML ");
            } else{
                int length = maiorNivel.length();
                String border = "+" + "-".repeat(length + 2) + "+";

                System.out.println("\n" + border);
                System.out.println("| " + maiorNivel + " |");
                System.out.println(border + "\n");
            }
    }
                
                

    }
    
    private static final List<String> voidElements = List.of("<area>", "<base>","<br>", "<col>","<embed>", "<hr>","<img>", "<input>","<link>", "<meta>","<param>","<source>","<track>","<wbr>");
    
    public static String verificaHTMLRegex (BufferedReader input) throws IOException {
        int max = Integer.MIN_VALUE;
        String storedStringRegex = "";
        String inputLine;
        Stack<String> pilha = new Stack<>();
        boolean temAbertura = false;
        boolean temFechadura = false;
        
        Pattern patternAbertura = Pattern.compile("^<([a-zA-Z]+)>$");
        Pattern patternFechadura = Pattern.compile("^</([a-zA-Z]+)>$");
        Pattern patternTexto = Pattern.compile("^[^<>]+$");  
        
        
        while ((inputLine = input.readLine()) != null){
            
            
            Matcher matcherAbertura = patternAbertura.matcher(inputLine.trim());
            Matcher matcherFechadura = patternFechadura.matcher(inputLine.trim());
            Matcher matcherTexto = patternTexto.matcher(inputLine.trim());

            if (matcherFechadura.matches()){
                temFechadura = true;
                if (pilha.isEmpty()){
                    return null;
                }
                if (pilha.peek().equals(matcherFechadura.group(1))){
                    pilha.pop();
                }
                else {
                    return null;
                }
            }
            
            else if (matcherAbertura.matches() && !voidElements.contains(inputLine.trim())){
                temAbertura = true;
                pilha.push(matcherAbertura.group(1));
            }

            else if (voidElements.contains(inputLine.trim()) || inputLine.trim().endsWith("/>") || inputLine.isBlank()){
            }

            else if (matcherTexto.matches()){
                max = Math.max(max, pilha.size());
                
                if (pilha.size()==max && storedStringRegex.isEmpty()){
                    storedStringRegex = inputLine;
                }
            }

            else {
                return null;
            }
            
        }

        if (!pilha.isEmpty() || !temAbertura || !temFechadura){
            return null;
        }
        else {
            return storedStringRegex.trim();
        }
    }

    public static String verificaHTML (BufferedReader input) throws IOException {
        int i = 0;
        int max = Integer.MIN_VALUE;
        String storedString = "";

        String inputLine;

        while((inputLine = input.readLine()) != null){

            if (inputLine.trim().startsWith("</")){
                i--;
                
                if (i < 0){
                    return null;
                }
            }
            
            else if (inputLine.trim().startsWith("<") && !voidElements.stream().anyMatch(inputLine::contains) && !inputLine.endsWith("/>")){
                i++;
            }
            
            else{
                max = Math.max(max, i);
                
                if (i==max && storedString.isEmpty()){
                    storedString = inputLine;
                }
            }   
        }
        
        if (i != 0){
            return null;
        }
        
        else{
        return storedString.trim();
        }

    }

    public static BufferedReader carregaHTML(String[] args){
        String uriString = args[0];

        try{
            URI uri = URI.create(uriString);
            URL urlString = uri.toURL();
            URLConnection uConn = urlString.openConnection();
            return new BufferedReader(new InputStreamReader(uConn.getInputStream()));
        } catch(IOException e){
            System.out.println("URL connection error");
            return null;
        }
    }

}