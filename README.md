<div align="center">
  <img src="site/web-data-viz/public/assets/logo.png" alt="HafuTech Logo" width="250px">
  <h1> HafuTech</h1>
  <h2>Shiva - Aplicação em Java  para processamento e tratamento de dados</h2>
  <h3>✨ Nossa Educação, Nosso Futuro ✨</h3>
</div>

<h3><b>📄 1. Descrição Geral</b></h3>
  <p>Esta aplicação Java implementa um fluxo de processamento e tratamento de dados. Ela realiza a leitura de dados de uma fonte CSV, em Excel, transforma-os conforme regras definidas e armazena o resultado em um banco de dados em MySQL, após isso, expõe as informações em uma aplicação web. 
   O objetivo é automatizar e padronizar o fluxo de atualização desses dados.</p>

<h3><b>🛠️ 2. Fluxo de Funcionamento</b></h3>
<img width="1604" height="693" alt="image" src="https://github.com/user-attachments/assets/6aaea979-1b70-4ee9-954a-3e731b089fd1" />

1. O código é compilado e direciona para um menu inicial.
2. A partir desse menu, existem 3 opções: inserir um novo arquivo, mostrar os já inseridos ou finalizar o programa.
3. Inserindo um novo arquivo:
   <br>3.1 O usuário informa o nome do arquivo.
   <br>3.2. O programa busca o arquivo dentro do Bucket S3.
   <br>3.3. Realiza a leitura via Apache POI.
   <br>3.4. Realiza o tratamento dos dados.
   <br>3.5. Insere no banco de dados MySQL, através de JDBC.
   <br>3.6. O programa é finalizado.

5. Mostrando os arquivos inseridos:
   <br>4.1. O usuário seleciona a opção.
   <br>4.2. Os arquivos inseridos no dia são listados, permitindo a visuliazação do usuário.
   <br>4.3. O usuário é direcionado para o menu inicial.

6. Finalizando o programa.

<h3><b>✅ Conclusão</b></h3>
   A aplicação reúne, de forma organizada, todas as etapas de leitura, tratamento e disponibilização dos dados. Ela automatiza tarefas que antes precisariam ser feitas manualmente, garantindo rapidez e menores chances de erro.
Com a leitura dos arquivos no S3, o processamento usando Apache POI, o armazenamento no MySQL e a exibição em uma aplicação web, o Shiva entrega um fluxo de dados claro, confiável e fácil de manter.
Dessa forma, o projeto cumpre seu objetivo de oferecer um processo de tratamento de dados bem estruturado e pronto para futuras melhorias.





