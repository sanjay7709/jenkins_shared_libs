def call(String project, String hubuser, String ACR_LOGINSERVER, String ImageTag){
    sh """
        kubectl set image deployment ${ACR_LOGINSERVER}/${project}:${ImageTag} --kubeconfig /var/lib/jenkins/config
        kubectl apply -f deployment.yml --kubeconfig /var/lib/jenkins/config
    """
}