pipeline {
    agent {
            docker {
                        image 'alpine/docker:20.10.16'
                        args '-v /var/run/docker.sock:/var/run/docker.sock'
            }
    }

    environment {
        COMPOSE_FILE = 'infra/docker-compose.yml'
    }

    stages {


        stage('Start infrastructure') {
            steps {
                sh 'docker-compose -f $COMPOSE_FILE up -d'
                sh 'sleep 10'  // немного подождать, пока сервисы поднимутся
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run Integration Tests') {
            steps {
                sh 'mvn verify -Pintegration-tests'
            }
        }

        stage('Stop infrastructure') {
            steps {
                sh 'docker-compose -f $COMPOSE_FILE down'
            }
        }
    }
}
