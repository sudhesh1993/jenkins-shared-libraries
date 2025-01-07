def call(string projectname, string imagetag, string dockerhubuser){
  echo 'Building Project'
  sh "docker build -t ${dockerhubuser}/${projectname}:${imagetag} ."
  echo "cloning done!!"
}
