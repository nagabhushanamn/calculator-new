
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
		stage("Code coverage") {
		     steps {
		          sh "./gradlew jacocoTestReport"
		          publishHTML (target: [
                            reportDir: 'build/reports/jacoco/test/html',
                            reportFiles: 'index.html',
                            reportName: "Test-Coverage Report"
                        ])
		          sh "./gradlew jacocoTestCoverageVerification"
		     }
		}
		stage("Static code analysis") {
		     steps {
		          sh "./gradlew checkstyleMain"
		          publishHTML (target: [
				     reportDir: 'build/reports/checkstyle/',
				     reportFiles: 'main.html',
				     reportName: "Checkstyle Report"
				])
		     }
		}
	}
}          







