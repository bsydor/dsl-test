multibranchPipelineJob('Backend') {
  branchSources {
    github {
      scanCredentialsId('github-clone')
      repoOwner('AVORA-LTD')
      repository('Backend')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
}
