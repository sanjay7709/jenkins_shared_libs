// def call(String project, String hubuser, String ImageTag){
//     withCredentials([usernamePassword(
//         credentialsId: 'docker', 
//         passwordVariable: 'pass', 
//         usernameVariable: 'user')]) {

//     sh "docker login -u '${user}' -p '${pass}' "

// }
//     sh "docker image push ${hubuser}/${project}:${ImageTag}"
//     sh "docker image push ${hubuser}/${project}:latest"
// }

def call(String project, String ACR_LOGINSERVER, String hubuser, String ImageTag){
withCredentials([usernamePassword(
    credentialsId: 'USER', 
    passwordVariable: 'ACR_PASSWORD', 
    usernameVariable: 'ACR_ID')]) {
        
    sh "docker login ${ACR_LOGINSERVER} -u ${ACR_ID} -p ${ACR_PASSWORD}"
}

    sh "docker push ${hubuser}/${project} ${ACR_LOGINSERVER}/${project}:${ImageTag}"
    sh  "docker push ${hubuser}/${project} ${ACR_LOGINSERVER}/${project}:latest"
}