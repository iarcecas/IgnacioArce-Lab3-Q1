pipeline {
    agent any
    tools {
        maven "MavenTool"
    }
    
    stages {
        stage("Build Maven"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/iarcecas/IgnacioArce-Lab3-Q1']])
                
                bat 'mvn clean install'
            }
        }
        stage("Build Docker Image"){
            steps{
                script{
                    env.PATH = "${env.PATH};C:\\Program Files\\Docker\\Docker\\resources\\bin"
                    bat 'docker build -t iarcecas/spring-devops .'   
                }
            }
        }
        stage("Push Docker Image to Docker Hub"){
            steps{
                script{
                    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', passwordVariable: 'dockerhub-password', usernameVariable: 'dockerhub-username')]) {
                        env.PATH = "${env.PATH};C:\\Program Files\\Docker\\Docker\\resources\\bin"
                        
                        bat "docker login -u %dockerhub-username% -p %dockerhub-password%"
                        
                        bat 'docker push iarcecas/spring-devops'   
                    }
                }
            }
        }
    }
}
