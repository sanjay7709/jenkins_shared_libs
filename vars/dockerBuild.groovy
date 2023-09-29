def call(String project, String hubuser, String Imagetag){
    sh '''
        docker build -t ${hubuser}/${project} .
        docker image tag ${hubuser}/${project} ${hubuser}/${project}:${Imagetag}
        docker image tag ${hubuser}/${project} ${hubuser}/${project}:latest
    '''
}