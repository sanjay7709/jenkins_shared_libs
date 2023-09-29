def call(String project, String hubuser, String Imagetag){
    sh '''
        docker image build ${hubuser}/${project} .
        docker image tag ${hubuser}/${project} ${hubuser}/${project}:${Imagetag}
        docker image tag ${hubuser}/${project} ${hubuser}/${project}:v1
    '''
}