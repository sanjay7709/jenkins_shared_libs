def call(credentialID){
    withSonarQubeEnv(credentialsId: 'credentialId') {
        sh 'mvn clean package sonar:sonar'
    } 
}