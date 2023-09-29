def call(String project, String hubuser, String ACR_LOGINSERVER, String ImageTag){
    sh """
        kubectl apply -f deployment.yml --kubeconfig /var/lib/jenkins/config
        kubectl set image deployment/deploy01 pod01=${ACR_LOGINSERVER}/${project}:${ImageTag} --kubeconfig /var/lib/jenkins/config
    """
}