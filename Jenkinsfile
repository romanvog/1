pipeline {
  agent { label 'master' }
  stages{
    stage('Build'){
        steps{
            sh 'mvn install'
        }
    }
  }
}
