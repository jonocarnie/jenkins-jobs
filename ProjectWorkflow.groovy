folder('manualprojects') {
    displayName('ManualProjects')
    description('Folder for all projects')
}

pipelineJob('manualprojects/ExampleOne') {
    definition {
        cps {
            script(readFileFromWorkspace('ProjectA/Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('manualprojects/ExampleTwo') {
    definition {
        cps {
            script(readFileFromWorkspace('ProjectB/Jenkinsfile'))
            sandbox()
        }
    }
}
