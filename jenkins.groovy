pipeline{
    agent any
    stages{
        stage('pulling code from repository'){
            steps{
                git branch: 'main', url: 'https://github.com/tanviparab786/CALYX.git'
            }
        }
        stage('deploying the code'){
            steps{
                sh 'whoami'
                sh 'sudo rm /var/www/html/CALYX/CALYX/* '
                sh 'sudo mv /var/lib/jenkins/workspace/frontend-pipeline/* /var/www/html/CALYX/CALYX'
                sh 'sudo systemctl restart nginx'

            }
        }
    }
}