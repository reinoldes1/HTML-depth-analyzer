# HTML Depth Analyzer

Technical challenge developed in Java to analyze the depth of HTML structures and extract the deepest level using only Java's native framework.

## About the project

The main goal is to identify and extract the deepest text line in a HTML structure, validating its structure (malformed check) and connection (URL Connection Error).

Each line in the HTML can only contain 1 element, being opening, closing and text. Only tags with pair will be used to determine the depth, which makes self-closing tags and opening tags with attributes not valid.

### Coding Development
1. **Initial Approach(Iteration):** I started by using a simple iterating logic of tags. Though functional for simple structures, I noticed limitations when dealing with more complex HTMLs.
2. **Final Approach (Regex + Stack):** After some tests I started developing a solution using Regular Expressions (Regex) and data structures (Stack) which facilitated a better validation of opening, closing, text and excluding self-closing and tags with attributes.

## Stack
- **Programming Language:** Java (JDK 20+)
- **Libraries:** "java.net", "java.io", "java.util"
- **Environment:** Developed and tested in Arch Linux

## How to run
```bash
javac HtmlAnalyzer.java
java HtmlAnalyzer.java <URL_OR_PATH_TO_FILE>
```

------------------------------------------------------

# HTML Depth Analyzer

Desafio técnico desenvolvido em java para analisar a profundidade da estrutura de um determinado HTML e extrair o conteúdo do nível mais profundo usando apenas o framework nativo do Java.

## Sobre o projeto

O objetivo principal é identificar a linha de texto com o maior nível de indentação em um determinado HTML, validando sua estrutura (malformed HTML) e conexão (URL Connection Error).

Cada linha do HTML poderia apenas conter 1 elemento, sendo ele de abertura, fechamento ou texto. Apenas pares de tags são utilizados para a contagem, sendo assim self-closing tags e tags de abertura com atributos não são contados.

### Desenvolvimento do código
1. **Abordagem Inicial:** Inicialmente comecei utilizando a lógica simples de iteração para a contagem. Embora tenha funcionado para estruturas simples o código falhava ao testar outros tipos de HTMLs mais complexos.
2. **Abordagem Final:** Depois de alguns testes comecei a desenvolver uma solução utilizando o Regular Expressions (Regex) e estrutura de pilhas (Stack) que facilitaram a melhor validação de tags de abertura, fechamento, texto e excluindo tags com atributos e self-closing.

## Ambiente
- **Linguagem de Programação:** Java (JDK 20+)
- **Bibliotecas:** "java.net", "java.io", "java.util"
- **Ambiente:** Desenvolvido e testado no Arch Linux

## Como rodar

```bash
javac HtmlAnalyzer.java
java HtmlAnalyzer.java <URL_OR_PATH_TO_FILE>
```