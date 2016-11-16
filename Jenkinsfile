node {
  stage 'Build and Test'
  git url: "https://github.com/robsoncassol/SplendorGarden.git"
  env.PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
  checkout scm
  sh 'mvn clean package'
 }
