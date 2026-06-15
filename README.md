<a id="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">HTML Depth Analyzer</h3>

  <p align="center">
    Technical challenge developed in Java to analyze the depth of HTML structures and extract the deepest level using only Java's native framework.
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About the Project</a>
      <ul>
        <li><a href="#coding-development">Coding Development</a></li>
        <li><a href="#build-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#how-to-run">How to Run</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About the project

[![HTML Analyzer][product-screenshot]](https://github.com/reinoldes1/HTML-depth-analyzer)

The main goal is to identify and extract the deepest text line in a HTML structure, validating its structure (malformed check) and connection (URL Connection Error).

Each line in the HTML can only contain 1 element, being opening, closing and text. Only tags with pair will be used to determine the depth, which makes self-closing tags and opening tags with attributes not valid.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Coding Development

1. **Initial Approach(Iteration):** I started by using a simple iterating logic of tags. Though functional for simple structures, I noticed limitations when dealing with more complex HTMLs.
2. **Final Approach (Regex + Stack):** After some tests I started developing a solution using Regular Expressions (Regex) and data structures (Stack) which facilitated a better validation of opening, closing, text and excluding self-closing and tags with attributes.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

* [![Java][Java]][Java-url]


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

To start, clone the repository:
  ```sh
  git clone https://github.com/reinoldes1/HTML-depth-analyzer.git
  ```

### How to Run

To execute, run the following on shell
  ```sh
    javac HtmlAnalyzer.java
    java HtmlAnalyzer.java <URL_OR_PATH_TO_FILE>
  ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTRIBUTING -->
## Contributing

Contributions are very welcome, feel free to make yours.

If you have any suggestions, fork the project and open a pull request!

1. Fork the project
2. Create a branch for your contribution (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open the Pull Request

<!-- Contact -->
## Contact

João Victor - [Linkedin](https://www.linkedin.com/in/joao-victor-nunes-reynolds/)

Link do Projeto: [HTML Analyzer](https://github.com/reinoldes1/HTML-depth-analyzer)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/reinoldes1/HTML-depth-analyzer.svg?style=for-the-badge
[contributors-url]: https://github.com/reinoldes1/HTML-depth-analyzer/graphs/contributors

[stars-shield]: https://img.shields.io/github/stars/reinoldes1/HTML-depth-analyzer.svg?style=for-the-badge
[stars-url]: https://github.com/reinoldes1/HTML-depth-analyzer/stargazers

[issues-shield]: https://img.shields.io/github/issues/reinoldes1/HTML-depth-analyzer.svg?style=for-the-badge
[issues-url]: https://github.com/reinoldes1/HTML-depth-analyzer/issues

[product-screenshot]: images/screenshot.png

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/en/