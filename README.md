Aluno:João Guilherme Alves de Lima  

Parte 1: Fundamentação Teórica
1. A Arquitetura MVC no Spring
Controller:** Camada responsável por expor os endpoints HTTP, receber requisições do cliente e retornar as respostas adequadas.
Service:** Camada onde residem as regras de negócio e validações da aplicação.
Repository:** Camada de persistência responsável por interagir diretamente com o banco de dados.
2. O Padrão DTO
Segurança: Protege a aplicação contra ataques de *Mass Assignment* / *Overposting*, garantindo que campos sensíveis (como `isAdmin` e `id`) não sejam alterados via JSON enviado pelo cliente.
Desacoplamento:** Separa o contrato da API das tabelas do banco de dados, permitindo que a estrutura interna evolua sem quebrar a integração com o Front-end.

Parte 2: Estudo de Caso e Códigos Java
O código refatorado das classes `UsuarioCadastroDTO.java` e `UsuarioController.java` encontra-se na pasta de código do projeto.

Parte 3: Payload JSON (Requisição POST)

```json
{
  "nome": "Cristiano Ronaldo",
  "email": "robozao123@email.com",
  "senha": "siuuu321"
}
