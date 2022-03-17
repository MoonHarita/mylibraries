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
 deploy adapters: [tomcat9(credentialsId: '709852eb-f517-4ba1-815b-05a5b7dbe495', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'  
}
