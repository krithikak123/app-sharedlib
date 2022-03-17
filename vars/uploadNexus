def call(artiId,credId,grpId,nexusurl,nversion){

     nexusArtifactUploader artifacts: [[artifactId: "${artiId}", file: "target/myweb-${pom.xml}.war", type: 'war']], credentialsId: "${credId}", groupId: "${grpId}", nexusUrl: "${nexusurl}", nexusVersion: "${nversion}", protocol: 'http', repository: 'kk-app-release', version: "${pom.xml}"
}    
