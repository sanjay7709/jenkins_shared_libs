def call(String project, String hubuser, String ImageTag){
    withCredentials([usernamePassword(
        credentialsId: 'docker', 
        passwordVariable: 'pass', 
        usernameVariable: 'user')]) {

    sh "docker login -u '${user}' -p '${pass}' "

}
    sh "docker image push ${hubuser}/${project}:${ImageTag}"
    sh "docker image push ${hubuser}/${project}:latest"
}