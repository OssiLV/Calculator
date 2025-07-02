import jenkins.model.Jenkins

pm = Jenkins.instance.pluginManager
uc = Jenkins.instance.updateCenter

pm.doCheckUpdatesServer()

[
     "workflow-aggregator",
     "credentials-binding",
     "junit",
     "github",
     "maven-plugin",
     "docker-build-publish",
].each {
    if (!pm.getPlugin(it)) {
        deployment = uc.getPlugin(it).deploy(true)
        deployment.get()
    }
}

// Restart
Jenkins.instance.restart()
