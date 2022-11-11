pipeline {
    agents any
    stsges {
        stage('pull'){
            steps {
                echo "pull succesful"
            }
        } 
        stage('build'){
            steps {
                echo "build succesful"
            }
        }
        stage('test'){
            steps {
                echo "test successfull"
            }
        }
        stage('deploy'){
            steps {
                echo "deploy successul"
            }
        }
    
    