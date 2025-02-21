# Start with a base image containing Java runtime
FROM openjdk:11-jdk

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=target/animechat-websocket-1.0.jar
ARG KEYSTORE=keystore.p12

RUN mkdir /websocket
WORKDIR /websocket

# Add the application's jar to the container
ADD ${JAR_FILE} /websocket/animechat-websocket-1.0.jar
ADD ${KEYSTORE} /websocket/keystore.p12

# Run the jar file
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/websocket/animechat-websocket-1.0.jar"]