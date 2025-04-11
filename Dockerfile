FROM jenkins/jenkins:lts

# Установка необходимых пакетов
USER root

# Установка OpenJDK 17 и Maven
RUN apt-get update 
RUN apt-get install -y openjdk-17-jdk maven
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

# Установка переменных окружения
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV MAVEN_HOME=/usr/share/maven
ENV PATH="$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH"

USER jenkins


# Установка переменных окружения
ENV JAVA_HOME=/usr/lib/jvm/jdk-17
ENV MAVEN_HOME=/usr/share/maven
ENV PATH="$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH"

USER jenkins
