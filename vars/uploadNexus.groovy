def call(credId,nexusurl,nversion){
     def pomFile = readMavenPom file: 'pom.xml'
     nexusArtifactUploader artifacts: [[artifactId: "${pomFile.artifactId}", file: "target/myweb-${pomFile.version}.war", type: 'war']], credentialsId: "${credId}", groupId: "${pomFile.groupId}", nexusUrl: "${nexusurl}", nexusVersion: "${nversion}", protocol: 'http', repository: 'kk-app-release', version: "${pomFile.version}"
}    
