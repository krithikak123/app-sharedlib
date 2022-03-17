def call(artiId,credId,grpId,nexusurl,nversion){

     nexusArtifactUploader artifacts: [[artifactId: "${artiId}", file: "target/myweb-${pomFile.version}.war", type: 'war']], credentialsId: "${credId}", groupId: "${grpId}", nexusUrl: "${nexusurl}", nexusVersion: "${nversion}", protocol: 'http', repository: 'kk-app-release', version: "${pomFile.version}"
}    
