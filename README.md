# Cities API

### Sobre

Cities ? uma API REST, desenvolvida em Java, como parte dos treinamentos em Java  da [Digital Innovation One.](https://digitalinnovation.one)

Ela foi desenvolvida e ministrada pelo professor  [Andr? Luis Gomes.](https://github.com/andrelugomes)


### Funcionalidade

A principal fun??o dessa API ? o c?lculo da dist?ncia entre duas cidades, mas ela tamb?m fornece algumas informa??es importantes como:

* lista de cidades, com c?digo do IBGE e localiza??o (latitude e longitude);
* lista de estados, com c?digo do IBGE, BACEN e DDDs;
* lista de pa?ses.


### Implanta??o em Produ??o

Cities foi disponibilizada na plataforma Cloud Heroku, com banco de dados PostgreSQL.

Suas funcionalidades podem ser testadas utilizando a ferramenta [Postman.](https://www.postman.com) Segue URLs para teste:

* Lista de pa?se - [https://cities-api-java.herokuapp.com/countries](https://cities-api-java.herokuapp.com/countries)
* Lista de estados - [https://cities-api-java.herokuapp.com/states](https://cities-api-java.herokuapp.com/states)
* Lista de cidades - [https://cities-api-java.herokuapp.com/cities](https://cities-api-java.herokuapp.com/cities)
* Dist?ncia entre duas cidades (em milhas) - [https://cities-api-java.herokuapp.com/distances/by-points?from=4929&to=5254](https://cities-api-java.herokuapp.com/distances/by-points?from=4929&to=5254)
*  Dist?ncia entre duas cidades (em km) - [https://cities-api-java.herokuapp.com/distances/by-cube?from=4929&to=5254](https://cities-api-java.herokuapp.com/distances/by-cube?from=4929&to=5254)


