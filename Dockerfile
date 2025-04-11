FROM jenkins/jenkins:lts

# Установка необходимых пакетов
USER root
RUN apt-get update && apt-get install -y wget && \
    # Установка JDK 20
    wget https://download.oracle.com/java/20/archive/jdk-20_linux-x64_bin.deb && \
    dpkg -i jdk-20_linux-x64_bin.deb && \
    apt-get install -f && \
    rm jdk-20_linux-x64_bin.deb && \
    # Установка Maven
    apt-get install -y maven && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

# Установка переменных окружения
ENV JAVA_HOME=/usr/lib/jvm/jdk-20
ENV MAVEN_HOME=/usr/share/maven
ENV PATH="$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH"

USER jenkins
