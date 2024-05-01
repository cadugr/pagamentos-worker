# Como iniciar

### Documentação de referência
Para inicializar o projeto, basta fazê-lo através de sua IDE preferida ou através do power shell (Windows) ou terminal (Linux ou MacOS), com o comando a seguir:

```console
./mvnw spring-boot:run
```

Se tudo der certo, e houver dados a serem consumidos da fila pagamento-request-queue, os mesmos serão consumidos e enviados ou para a fila pagamento-response-sucesso-queue ou pagamento-response-erro-queue.  Por fim, os dados enviados para uma destas duas filas, serão consumidos no outro projeto, a saber:

* [Backend API](https://github.com/cadugr/backend-api)

Créditos totais e referência:

* [Tutorial Spring Boot e RabbitMQ](https://medium.com/@thiagolenz/tutorial-spring-boot-e-rabbitmq-como-fazer-e-porqu%C3%AA-4a6cc34a3bd1)
