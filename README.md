# :book: About Project

Esse repositório trata-se de um micro-serviço desenvolvido utilizando a linguagem Java e padrões de arquitetura como Hexagonal e Clen Arch, ambos padrões ensinados durantes as aulas da matéria Software Engineering Development ministradas pelo professor Rafael Tsuji Matsuyama.

Alunos Envolvidos:

1. Luiz Felipe Oliveira
2. Matheus Lando
3. Marcos Moura
4. Wellington Brandão

## :closed_book: About Bookshelf 

Desenvolvemos um conceito de Estante de Livros, onde o usuário pode salvar livros que já possui, simulando uma coleção virtual.

Inicialmente o projeto foi desenvolvido utilizando um "Repository" fixo, ou seja chumbado na propria aplicação. Futuramente poderia ser trocado por um banco de dados.

## Tech's

Para desenvolvimento desse projeto foi utilizado as tecnologias:

- Docker / Docker Compose
- Java 11

## Concepts / Patterns

No desenvolvimento desse projeto foi utilizando os conceitos e padrões.

- Singleton
- Clean Architecture
- Hexagonal
- TDD 

O padrão de arquitetura, foi utilizado uma mistura de Clean Arch com Hexagonal.
Dessa forma o código foi divido em camadas.

* Application    : Entrada - Camada exposta para fora
* Domain         : Responsável por toda regra de negócios do projeto
* Infrastructure : Controla todas as ferramentas e dependências externas
 
# How Start

Para executar o projeto é necessário as seguintes ferramentas:

- Docker
- Java                          (Caso queira executar fora do docker)
- Maven                         (Caso queira executar fora do docker)
- Idle Compativel com Java      (Caso queira executar fora do docker)

Com o Docker instalado bastar executar o seguinte comando:

```bash
$ docker compose up
```

Será disponibilizado a aplicação na porta 8084.

## Endpoint

GET /api/v1/book
O metódo GET não requer nenhum header ou body.

POST /api/v1/book
| Tipo          | Valor                     |  
| :------------ |--------------------------:|
| Body          | Um objeto do tipo Book    |

Caso queira, segue versionado a collection para utilização dentro do Insomnia ou Postman.

