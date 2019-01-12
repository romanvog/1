pipeline {
  agent { label 'calc_test' }
  stages{
    stage('Build'){
        steps{
            sh 'mvn install'
        }
    }
  }
}
