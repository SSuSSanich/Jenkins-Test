pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -X -DskipTests'
            }
        }
        stage('Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo '✅ CI успешно прошёл'
        }
        failure {
            echo '❌ Ошибка в PR'
        }
    }
}
