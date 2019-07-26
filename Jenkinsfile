pipeline {
    agent any

    triggers {
        cron('H * * * *')
    }
    stages {
        stage('Test'){
            steps {
                echo 'On instal le vendor'
                sh 'composer up'
                echo 'on realise les tests unitaire'
                sh 'docker run -v $(pwd):/app --rm phpunit/phpunit:latest --bootstrap monsite/functions.php monsite/functionstest.php'
            }
        }
        stage('Installation'){
            steps{
                echo 'on instal les containers docker'
                sh 'docker-compose up'
            }
        }
    }
}