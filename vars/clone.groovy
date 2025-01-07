def call(String url, String branch){
echo 'Cloning Project'
git url: "${url}", branch: "${branch}"
}
