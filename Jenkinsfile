pipeline {
  agent { label 'calc_test' }
  stages{
    stage('update and install'){
        steps{
            sh 'cd /root/git/1 && git pull && mvn install'
        }
    }
  }
}
