
# API de Clientes - SpringBoot

Este é um aplicativo Java/Maven/Spring Boot de amostra que pode ser utilizado como iniciador de APIs com validação.


## Sobre a API

O serviço é apenas um simples serviço REST de cadastro de clientes. Ele usa um banco de dados na memória (H2) para armazenar os dados. Você também pode fazer com um banco de dados relacional como MySQL ou PostgreSQL. 


## Funcionalidades

- Criação de Cliente - save()
- Atualização de Cliente - updateClient()
- Consultar Cliente - getClient()
- Apagar Cliente - deleteClient()


## Criar um Cliente

```json
POST /api/clientes
Accept: application/json
Content-Type: application/json

{
    "nome": "Rodrigo Paluma",
    "cpf": "11111111111"
}

RESPONSE: HTTP 201 (Created)
Location header: http://localhost:8080/api-clientes/1
```

## Atualizar Cliente

```json
PUT /api/clientes/1
Accept: application/json
Content-Type: application/json

{
    "nome": "Rodrigo de S. Paluma",
    "cpf": "11111111111"
}

RESPONSE: HTTP 204 (No Content)
Location header: http://localhost:8080/api-clientes/1
```

## Consultar Cliente

```json
GET /api/clientes/1
Accept: application/json
Content-Type: application/json

RESPONSE: HTTP 200 (OK)
Location header: http://localhost:8080/api-clientes/1
```

## Apagar Cliente

```json
DELETE /api/clientes/1
Accept: application/json
Content-Type: application/json

RESPONSE: HTTP 204 (No Content)
```

# Olá, eu sou Rodrigo Paluma! 👋


## 🚀 Sobre mim
Um novo entusiasta do Java, entrado no mundo Fullstack, buscando sempre unir definições e práticas de usabilidade e de planejamento da interface, 
proporcionando aos usuários formas acessíveis e confortáveis de navegabilidade. Desenvolvo sites e sistemas compatíveis com dispositivos móveis(Ipad, Tablet, Iphone e Smartphones). 




## Licença

[MIT](https://choosealicense.com/licenses/mit/)


## Informações sobre mim
👩‍💻 Trabalho atualmente na ProgressRail - Caterpillar Inc.

🧠 Estou aprendendo NodeJS, MongoDB e Java




