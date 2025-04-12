FROM jenkins/jenkins:lts

# Установка необходимых пакетов
USER root

# Установка OpenJDK 17 и Maven
RUN apt-get update 
RUN apt-get install -y maven
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

USER jenkins
