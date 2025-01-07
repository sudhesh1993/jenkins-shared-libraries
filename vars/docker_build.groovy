def call(String projectname, String imagetag, String dockerhubuser){
  echo 'Building Project'
  sh "docker build -t ${dockerhubuser}/${projectname}:${imagetag} ."
  echo "cloning done!!"
}
