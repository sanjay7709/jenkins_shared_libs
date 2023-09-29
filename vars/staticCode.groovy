def call(credentialID){
    withSonarQubeEnv(credentialsId: credentialID) {
        sh 'mvn clean package sonar:sonar'
    } 
}