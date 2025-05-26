pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('Sonar-token')
    }

    stages {
        stage('Clone') {
            steps {
                git url: 'https://github.com/RenstX/BuggyJavaApp', branch: 'main'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compilation de BuggyJavaApp.java'
                sh 'javac BuggyJavaApp.java'
            }
        }

        stage('Sonar-Scanner') {
            steps {
                withSonarQubeEnv('SQ1') {
                    sh 'sonar-scanner'
                }
            }
        }
    }
}
