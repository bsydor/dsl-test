pipelineJob('selenium') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/AVORA-LTD/selenium.git')
                branch('test-jenkins')
                credentialsId('github-clone')
                scriptPath('JenkinsFile')
            }
        }
    }
}
