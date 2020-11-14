// MyProject-Build.groovy

def gitUrl = "https://github.com/jonocarnie/jenkins-jobs.git"

job("MyProject-Build") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url gitUrl.
                branch "origin/master"
            }
            extensions {
                wipeOutWorkspace()
            }
        }
    }
    steps {
        shell "echo 'Look: Building master!'"
    }
}