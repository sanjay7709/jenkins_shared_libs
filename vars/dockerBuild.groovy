// def call(String project, String hubuser, String ImageTag){
//     sh """
//         docker image build -t ${hubuser}/${project} .
//         docker image tag ${hubuser}/${project} ${hubuser}/${project}:${ImageTag}
//         docker image tag ${hubuser}/${project} ${hubuser}/${project}:latest
//     """
// }

def call(String project, String hubuser, String ACR_LOGINSERVER, String ImageTag){
    sh """
        docker image build -t ${hubuser}/${project} .
        docker tag ${hubuser}/${project} ${ACR_LOGINSERVER}/${project}:${ImageTag}
        docker tag ${hubuser}/${project} ${ACR_LOGINSERVER}/${project}:latest
}