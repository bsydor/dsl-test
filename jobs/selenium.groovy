pipelineJob('selenium') {
    definition {
        cpsScm {
            scm {
                git {
                  branch('test-jenkins')
                  remote {
                    url('https://github.com/AVORA-LTD/selenium.git')
                    credentials('github-clone')
                  }
                }
                scriptPath('Jenkinsfile')
            }
           triggers {
             //  githubPush()
             cron('15 7 * * *')
           }
        }
    }
}
