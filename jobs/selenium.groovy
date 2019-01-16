pipelineJob('selenium') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/AVORA-LTD/selenium.git')
                credentialsId('github-clone')
                scriptPath('JenkinsFile')
            }
        }
    }
}
