pipelineJob('selenium') {
    definition {
        cpsScm {
            scm {
                git {
                  branch('test-jenkins')
                  remote('https://github.com/AVORA-LTD/selenium.git')
                  credentialsId('github-clone')
                }
                scriptPath('JenkinsFile')
            }
        }
    }
}
