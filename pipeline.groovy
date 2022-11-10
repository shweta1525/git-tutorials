pipeline {
    agents any
    stages {
        stage('pull'){
            steps {
                echo ('pull successful')
            }
        }
    stages('build'){
        steps {
            echo ('build successful')
        }
    }