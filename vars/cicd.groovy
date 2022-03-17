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

def newTest(workspace)
{
  echo "${workspace}"
  sh "java -jar /home/ubuntu/.jenkins/workspace/${workspace}/testing.jar"
}

def newEmail(email,subject,body)
{
  mail bcc: '', body: "${body}", cc: '', from: '', replyTo: '', subject: "${subject}", to: "${email}"
}
