def call(Map stageparams){

    checkout([
        $class: 'GitSCM'
        branches: [[name: 'stageParams.branch ']],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])

}