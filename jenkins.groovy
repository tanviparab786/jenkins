pipeline{
    agent any
    stages{
        stage('pulling code from repository'){
            steps{
                git branch: 'main', url: 'https://github.com/tanviparab786/jenkins.git'
            }
        }
        stage('deploying the code'){
            steps{
                sh 'whoami'
                sh 'sudo mv /var/lib/jenkins/workspace/frontend-pipeline/* /var/www/html/'

            }
        }
    }
}