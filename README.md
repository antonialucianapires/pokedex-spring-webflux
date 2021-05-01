# pokedex-spring-webflux

Essa aplicação foi criada a partir do artigo/tutorial [Passo a passo de como criar seu Pokedex com Spring WebFlux](https://dev.to/womakerscode/criando-seu-pokedex-com-spring-webflux-mongodb-deploy-no-heroku-21f5). O objetivo da aplicação é mostrar na prática a utilização do Spring WebFlux com foco na abordagem reativa que busca propor um melhor comportamento em cenários de requisições paralelas, sobretudo em grande volume de acessos.

### 1) Execução
Para executar a aplicação, faça o download e execute o comamndo a seguir:

```
mvn clean install

```

Em seguida, em sua IDE, execute a classe ReactivewebApplication.

### 2) Endpoints

| Descrição                                                                      | Endpoint         |
|--------------------------------------------------------------------------------|------------------|
| Listar todos os pokemons && Inserir novo pokemon  && Deletar todos os pokemons | /pokemons        |
| Listar todos os eventos                                                        | /pokemons/events |
| Atualizar pokemon && Deletar pokemon por Id                                    | /pokemons/id     |
