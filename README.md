# cleanarch

## Objetivo

O Objetivo deste projeto é mostrar uma implementação da Clean Architecture em Java

## Libraries/Softwares

São necessárias bibliotecas e softwares externas a este projeto, a fim de execuá-lo, a saber:
[MongoDB](https://mongodb.com/)
[WireMock](https://wiremock.org/docs/download-and-installation/)

## Dependências

O gerenciador de dependências usado é o Maven, consulte o pom.xml para saber as dependências e versões utilizadas

## Mock da API de endereços
O projeto simula a conexão a uma API de busca de endereço e para tal é usado a biblioteca [WireMock]().

Para criar uma massa de dados, crie um arquivo JSON para cada endereço que queira consultar e salve-o dentro da pasta mappings. Esta é gerada após a primeira execução do WireMock.

```json
{
    "request": {
        "method": "GET",
        "url": "/addresses/12345"
    },
    "response": {
        "status": 200,
        "headers": {
            "Content-Type": "application/json"
        },
        "jsonBody": {
            "street": "Rua Teste",
            "city": "Teste de cidade",
            "state": "Teste de Estado"
        }
    }
}
```