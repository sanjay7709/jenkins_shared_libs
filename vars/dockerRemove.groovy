def call(String project, String hubuser, String ImageTag){
    sh """
        docker rmi ${hubuser}/${project}:${ImageTag}
        docker rmi ${hubuser}/${project}:latest
    """
}