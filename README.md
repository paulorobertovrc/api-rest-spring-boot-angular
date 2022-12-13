# Single-Page Application em Angular integrada a uma API desenvolvida em Spring que implementa operações CRUD
<p align="justify">Protótipo de uma aplicação básica para controle e gestão de estoque.</p>
<p align="justify">Neste primeiro momento, foram implementadas apenas as operações básicas de um CRUD – create, read, update and delete –, o que permite cadastrar, listar, alterar e remover objetos do banco de dados (optou-se, no caso, pelo mySQL).</p>
<p align="justify">No backend, foi implementada uma API em Java, com Spring Boot 3, responsável por validar os dados de cada requisição enviada pelo cliente e estabelecer a comunicação com o banco de dados, responsabilizando-se pelo acesso e persistência dos dados, bem como por devolver a resposta ao lado do cliente. 
O frontend foi desenvolvido com o framework Angular e os componentes do Angular Material, sendo algumas alterações de estilo pontuais feitas diretamente em CSS.</p>
<p align="justify">O usuário manipula o sistema por meio de uma single page application e a comunicação com o lado do servidor é totalmente transparente.</p>
<p>Principais frameworks/tecnologias utilizados:</p>
<li> Angular 15.0.2;</li>
<li> Spring Boot 3;</li>
<li> Java 17;</li>
<li> Maven</li>
<li> Lombok;</li>
<li>Hibernate.</li>



Para rodar a aplicação, é necessário acessar a pasta `/front`, executar o comando `npm run start` e acessar `http://localhost:4200/`. Também é necessário executar o método `main` a partir da classe `ApiApplication.java` para subir o servidor do backend.

-----

# Single-Page Application designed in Angular and integrated with an API developed in Spring that implements CRUD operations
<p align="justify">Prototype of a basic application for inventory control and management.</p>
<p align="justify">At this first moment, only the basic operations of a CRUD were integrated – create, read, update and delete –, which allows registering, listing, updating and removing objects from the database (mySQL was chosen in this case).
<p align="justify">On the backend, an API in Java, developed with Spring Boot 3, is responsible for validating each request sent by the client-side and establishing communication with the database, being responsible for the access and persistence of the data, as well as for returning the response. The frontend was developed with the Angular framework and Angular Material components, with some occasional style changes made directly in CSS.</p>
<p align="justify">The user manipulates the system through a single-page application and communication with the server-side is completely transparent.</p>
<p align="justify">Main frameworks/technologies used:</p>
<li> Angular 15.0.2;</li>
<li> Spring Boot 3;</li>
<li> Java 17;</li>
<li> Maven</li>
<li> Lombok;</li>
<li>Hibernate.</li>


To run the application, you need to access the `/front` folder, execute the `npm run start` command and access `http://localhost:4200/`. It is also necessary to execute the `main` method from the `ApiApplication.java` class to start the backend server.

Tela principal / Main screen
<img width="1440" alt="Main screen" src="https://user-images.githubusercontent.com/70707151/207307528-42fcfcfb-a5d0-4717-8832-fa6220ab1671.png">


Tela de alterar produto / Update product screen
<img width="1440" alt="Update screen" src="https://user-images.githubusercontent.com/70707151/207307859-633bb590-7c95-4386-a6f8-3b017791928b.png">


Tela de novo produto / New product screen
<img width="1440" alt="New product screen" src="https://user-images.githubusercontent.com/70707151/207307891-5a684979-40c4-44bd-a6e3-d64d2b8975ad.png">
