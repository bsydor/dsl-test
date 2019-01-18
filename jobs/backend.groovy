pipelineJob('Backend') {
    definition {
        cpsScm {
            scm {
                git {
                  branches('uat', 'develop')
                  remote {
                    url('https://github.com/AVORA-LTD/Backend.git')
                    credentials('github-clone')
                  }
                }
                scriptPath('Jenkinsfile')
            }
           triggers {
             githubPush()
           }
        }
    }
}
