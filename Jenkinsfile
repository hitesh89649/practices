pipeline {
    agent any

    tools {
        maven 'Maven-Local'
    }

    stages {

        stage('Clone Code') {
            steps {
                echo 'Cloning repository...'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
    }
}