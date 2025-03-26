<h1 align="center">
Place Service
</h1>



API para criar lugares  que faz parte [desse desafio](https://github.com/RocketBus/quero-ser-clickbus/tree/master/testes/backend-developer) para pessoas desenvolvedoras backend que se candidatam para a ClickBus.



## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Spring Data + R2DBC](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Slugify](https://github.com/slugify/slugify)

## Práticas adotadas

- SOLID
- Testes automatizados
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

## Como Executar

### Localmente
- Clonar repositório git
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar place-service/target/place-service-0.0.1-SNAPSHOT.jar
```


### Usando Docker

- Clonar repositório git
- Construir o projeto:
```
./mvnw clean package
```
- Construir a imagem:
```
./mvnw spring-boot:build-image
```
- Executar o container:
```
docker run --name place-service -p 8080:8080  -d place-service:0.0.1-SNAPSHOT
```

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- POST /places
```
http POST :8080/places name="Place" state="State"

HTTP/1.1 200 OK
Content-Length: 129
Content-Type: application/json

{
    "createdAt": "2023-04-20T19:00:07.241632",
    "name": "Place",
    "slug": "place",
    "state": "State",
    "updatedAt": "2023-04-20T19:00:07.241632"
}
