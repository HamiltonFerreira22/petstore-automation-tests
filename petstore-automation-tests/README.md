# Petstore Automation Tests

Este projeto tem como objetivo avaliar a capacidade técnica em testes automatizados utilizando a API do Petstore disponível em [https://petstore.swagger.io/](https://petstore.swagger.io/). Foram implementados casos de teste para validar diferentes funcionalidades da API, garantindo a integridade das respostas e o correto comportamento das operações.

## Estrutura do Projeto

```
petstore-automation-tests/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── petstore/
│   │                   ├── models/
│   │                   │   ├── Order.java
│   │                   │   └── Pet.java
│   │                   └── utils/
│   │                       └── ApiConfig.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── petstore/
│                       └── tests/
│                           ├── CreateOrderTest.java
│                           ├── GetNonExistentPetTest.java
│                           ├── UpdatePetTest.java
│                           └── FindPetsByStatusTest.java
├── pom.xml
└── README.md
```

### Descrição dos Diretórios e Arquivos

- **src/main/java/com/example/petstore/models/**: Contém as classes de modelo que representam os dados utilizados nos testes, como `Order` e `Pet`.
- **src/main/java/com/example/petstore/utils/**: Contém classes utilitárias, como `ApiConfig.java`, que configura a URI base da API.
- **src/test/java/com/example/petstore/tests/**: Contém as classes de teste que implementam os casos de teste automatizados utilizando JUnit 5 e RestAssured.
- **pom.xml**: Arquivo de configuração do Maven que gerencia as dependências e plugins do projeto.
- **README.md**: Este arquivo, contendo a documentação do projeto.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada para desenvolver os testes automatizados.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **RestAssured**: Biblioteca Java para facilitar a realização de requisições HTTP e validação de respostas em testes de APIs.
- **JUnit 5**: Framework de testes unitários para Java, utilizado para estruturar e executar os testes.
- **Gson**: Biblioteca para serialização e desserialização de objetos Java em JSON.

## Casos de Teste Implementados

1. **Cadastrar Novo Pedido de Pet com Sucesso**
   - **Endpoint**: `POST /store/order`
   - **Descrição**: Envia uma requisição para criar um novo pedido de pet e valida se a resposta possui o status code 200 e os dados corretos.

2. **Pesquisar por um Pet Inexistente**
   - **Endpoint**: `GET /pet/{petId}`
   - **Descrição**: Tenta buscar um pet com um ID inexistente e valida se a resposta possui o status code 404 e a mensagem de erro apropriada.

3. **Atualizar Dados de um Pet Existente**
   - **Endpoint**: `PUT /pet`
   - **Descrição**: Atualiza as informações de um pet existente e valida se a resposta reflete as alterações corretamente.

4. **Pesquisar por Pets com Status “pending”**
   - **Endpoint**: `GET /pet/findByStatus`
   - **Descrição**: Busca pets com o status "pending" e valida se todas as pets retornadas possuem esse status.

## Como Executar os Testes

1. **Pré-requisitos**
   - Java JDK 8 ou superior instalado.
   - Maven instalado e configurado nas variáveis de ambiente.
   - Acesso à internet para realizar as requisições à API do Petstore.

2. **Clonar o Repositório**
   ```bash
   git clone https://github.com/seu-usuario/petstore-automation-tests.git
   cd petstore-automation-tests
   ```

3. **Executar os Testes**
   ```bash
   mvn clean test
   ```
   Os resultados dos testes serão exibidos no console, indicando quais testes passaram ou falharam.

## Considerações Finais

Este projeto demonstra a implementação de testes automatizados para uma API RESTful utilizando Java e RestAssured. A organização do código segue boas práticas de estruturação, facilitando a manutenção e escalabilidade dos testes. As asserções foram definidas de maneira a garantir a conformidade das respostas da API com os requisitos especificados.

---

**Desenvolvido por:** Hamilton Ferreira

**Data:06/10/2024** Outubro de 2024
