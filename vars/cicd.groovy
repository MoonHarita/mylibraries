def newGit("repo")
{
  git "${repo}"
}
def newBuild()
{
  sh 'mvn package'
}  
