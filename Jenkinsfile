pipeline {
  agent any
  stages {
    stage('prebulid') {
      steps {
        echo 'hello-world'
      }
    }

    stage('version') {
      steps {
        sh '''java --version
mvn -v
git --version'''
      }
    }

  }
}