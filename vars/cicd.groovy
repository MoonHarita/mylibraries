def newGit(repo)
{
  git "${repo}"
}

def newBuild() 
{
  sh 'mvn package'
}

def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '98cf49fe-c3fb-4735-bca3-b96513c9f772', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}

def newTest(workspace)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${workspace}/testing.jar"
}


