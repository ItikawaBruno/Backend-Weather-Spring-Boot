# Use uma imagem base Maven para construir a aplicação
FROM maven:3.8.5-openjdk-17 AS build

# Definir o diretório de trabalho dentro do container de build
WORKDIR /app

# Copiar os arquivos do projeto (pom.xml e código fonte)
COPY pom.xml .
COPY src ./src

# Construir o projeto Maven, pulando os testes
RUN mvn clean install -DskipTests

# Segunda etapa: Use uma imagem Java mais leve para rodar a aplicação
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho dentro do container final
WORKDIR /app

# Copiar o JAR construído da etapa "build" para o container final
COPY --from=build /app/target/Weather-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que sua aplicação Spring Boot usa (padrão 8080)
EXPOSE 8080

# Comando para executar sua aplicação quando o container iniciar
ENTRYPOINT ["java","-jar","app.jar"]