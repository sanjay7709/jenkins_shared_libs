// def call(String project, String hubuser, String ImageTag){
//     sh """
//         docker rmi ${hubuser}/${project}:${ImageTag}
//         docker rmi ${hubuser}/${project}:latest
//     """
// }


def call(String project, String hubuser, String ACR_LOGINSERVER, String ImageTag){
    sh """
        docker rmi ${ACR_LOGINSERVER}/${project}:${ImageTag}
        docker rmi${ACR_LOGINSERVER}/${project}:latest
    """
}