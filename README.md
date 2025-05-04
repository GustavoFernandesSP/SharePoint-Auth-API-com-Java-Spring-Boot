# 🔐 API de Autenticação com Spring Boot (Login, Cadastro e Roles)

Este projeto é uma API desenvolvida com **Java + Spring Boot** que oferece funcionalidades de **cadastro**, **login** e **controle de acesso por perfis (roles)** como `ADMIN` e `USER`, utilizando autenticação via **JWT**.

---

## 🚀 Funcionalidades

- Cadastro de usuários
- Login com geração de token JWT
- Controle de acesso baseado em papéis (Roles: `ADMIN` e `USER`)
- Proteção de rotas com Spring Security
- Testes com Insomnia ou Postman

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
  - Spring Web
  - Spring Security
  - Spring Data JPA
- JWT
- Banco de Dados ( PostgreSQL )
- Insomnia / Postman
- Maven

---

## ⚙️ Como Rodar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repo.git
   cd seu-repo
Configure o application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/sua_base
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# JWT
jwt.secret=seuSegredoJWT
jwt.expiration=86400000
Execute o projeto:
./mvnw spring-boot:run

🧪 Endpoints Principais
🔐 Cadastro de Usuário
POST /auth/register

Body:
{
  "email": "usuario@email.com",
  "password": "senha123",
  "role": "USER"
}
🔑 Login
POST /auth/login

Body:
{
  "email": "usuario@email.com",
  "password": "senha123"
}
Retorno: Token JWT

🔒 Acesso Protegido
Endpoint de exemplo: GET /users

Header:
Authorization: Bearer <SEU_TOKEN_JWT>
📁 Estrutura do Projeto
src/<br>
├── controller/<br>
├── model/<br>
├── repository/<br>
├── service/<br>
├── security/<br>
└── config/<br><br>
📄 Licença
Este projeto está sob a licença MIT.
<br><br>
👤 Autor
Desenvolvido por Gustavo Fernandes
📧 gustavo.fernandes@sptech.school
🔗 [LinkedIn](https://www.linkedin.com/in/gustavo-fernandes-628450231/).
