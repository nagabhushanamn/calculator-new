
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
		stage("Unit test") {
		     steps {
		          sh "./gradlew test"
		          publishHTML (target: [
                        reportDir: 'build/reports/tests/test',
                        reportFiles: 'index.html',
                        reportName: "UnitTest Report"
                  ])
		     }
		}
	}
}          