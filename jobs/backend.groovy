pipelineJob('Backend') {
    definition {
        cpsScm {
            scm {
                git {
                  branches(':^(?!origin/uat$|origin/dev$|origin/test-jenkins$).*')
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
