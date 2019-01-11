pipeline {
  agent { label 'calc_test' }
  stage('git pull'){
    git 'https://github.com/romanvog/1/'
  }
  stage ('mvn install'){
    sh 'mvn install'
  }
}
