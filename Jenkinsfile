pipeline {
  agent { label 'master' }
  stages{
    stage('Build'){
        steps{
            sh 'mvn install'
        }
    }
    stage('Test'){
        steps{
            sh 'mvn test'
        }
    }
    stage('Prepare release'){
        steps{
            sh 'mvn release:prepare'
        }
    }
  }
}
