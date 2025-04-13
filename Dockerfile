FROM jenkins/jenkins:lts

USER root

RUN apt-get update && apt-get install -y docker.io
RUN usermod -aG docker jenkins
RUN usermod -aG systemd-journal jenkins
USER jenkins
