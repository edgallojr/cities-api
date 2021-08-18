# Cities API

### Sobre

Cities é uma API REST, desenvolvida em Java, como parte dos treinamentos em Java  da [Digital Innovation One.](https://digitalinnovation.one)

Ela foi desenvolvida e ministrada pelo professor  [André Luis Gomes.](https://github.com/andrelugomes)


### Funcionalidade

A principal função dessa API é calcular a distância entre duas cidades, mas ela também fornece algumas informações importantes como:

* lista de cidades, com código do IBGE e localização (latitude e longitude);
* lista de estados, com código do IBGE, BACEN e DDDs;
* lista de países.


### Implantação em Produção

Cities foi disponibilizada na plataforma Cloud  [Heroku.](https://www.heroku.com), com banco de dados  [PostgreSQL.](https://www.postgresql.org/).

Suas funcionalidades podem ser testadas utilizando a ferramenta [Postman.](https://www.postman.com) Segue URLs para teste:

* Lista de paíse - [https://cities-api-java.herokuapp.com/countries](https://cities-api-java.herokuapp.com/countries)
* Lista de estados - [https://cities-api-java.herokuapp.com/states](https://cities-api-java.herokuapp.com/states)
* Lista de cidades - [https://cities-api-java.herokuapp.com/cities](https://cities-api-java.herokuapp.com/cities)
* Distância entre duas cidades (em milhas) - [https://cities-api-java.herokuapp.com/distances/by-points?from=4929&to=5254](https://cities-api-java.herokuapp.com/distances/by-points?from=4929&to=5254)
*  Distância entre duas cidades (em km) - [https://cities-api-java.herokuapp.com/distances/by-cube?from=4929&to=5254](https://cities-api-java.herokuapp.com/distances/by-cube?from=4929&to=5254)


