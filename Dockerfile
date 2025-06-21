# Use uma imagem base Java 17 (você está usando Java 17, então é compatível)
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR da sua aplicação para o container
COPY target/Weather-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que sua aplicação Spring Boot usa (padrão 8080)
EXPOSE 8080

# Comando para executar sua aplicação quando o container iniciar
ENTRYPOINT ["java","-jar","app.jar"]