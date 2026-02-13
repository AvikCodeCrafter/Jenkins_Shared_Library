def call(){
  dependencyCheck additionalArguments: '--scan ./ --noupdate', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}

  //dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
  //dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
