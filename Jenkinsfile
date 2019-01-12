pipeline {
  agent { label 'master' }
  stages{
    stage('Install'){
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
            sh 'mvn rpm:rpm'
        }
    }
  }
}
