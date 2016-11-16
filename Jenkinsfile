node {
  stage 'Build and Test'
  git url: "https://github.com/robsoncassol/SplendorGarden.git"
  env.PATH = "${tool 'mvn'}/bin:${env.PATH}"
  checkout scm
  sh 'mvn clean package'
 }
