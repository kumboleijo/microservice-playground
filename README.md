# Microservice Playground

> Start from zero - let's see where we end up 🤪


## Tools

- Spring Initializr (`sdk install springboot`)
- VSCode for coding, debugging and running the microservices locally
- Docker
- Kubernetes for orchestration

## Topics / Investigations

- How to use VSCode properly for Java (Spring Boot) development?
- How to create a Java Library?
- How the heck to use GraalVM?

## Generate a Java Library using Maven

```
mvn archetype:generate -DgroupId=com.kumboleijo.microservices -DartifactId=api -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```