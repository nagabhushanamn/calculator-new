
pipeline {
     agent any
     stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/nagabhushanamn/calculator-new.git'
            }
          }
          stage("Compile") {
		     steps {
		          sh "./gradlew clean compileJava"
		     }
		}
	}
}          