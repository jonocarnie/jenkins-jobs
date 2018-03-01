folder('projects') {
    displayName('Projects')
    description('Folder for all projects')
}

pipelineJob('projects/ExampleA') {
    definition {
        cps {
            script(readFileFromWorkspace('ProjectA/Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('projects/ExampleB') {
    definition {
        cps {
            script(readFileFromWorkspace('ProjectA/Jenkinsfile'))
            sandbox()
        }
    }
}
