pipeline {
    agent any

    tools {
        maven 'maven-Local'
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
        stage('Archive Artifacts') {
                    steps {
                        archiveArtifacts artifacts:'targets/*.jar', fingerprint:true
                    }
                }
        stage('Deploy') {
                    steps {
                        echo 'Deploying application..'
                        bat 'echo Deployment Successful..'
                    }
                }

    }
}