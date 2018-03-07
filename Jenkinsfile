
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
		
		stage("Package") {
		     steps {
		          sh "./gradlew build"
		     }
		}
		
		
		stage("Docker build") {
		     steps {
		          sh "docker build -t localhost:5000/calculator ."
		     }
		}
		
		stage("Docker push") {
		     steps {
		          sh "docker push localhost:5000/calculator"
		     }
		}
		
		stage("Deploy to staging") {
		     steps {
		          sh "docker run -d --rm -p 8765:8080 --name calculator localhost:5000/calculator"
		     }
		}
		
		stage("Acceptance test") {
		     steps {
		          sleep 20
		          sh "./acceptance_test.sh"
		     }
		}
		
		
	}
	
	post {
     always {
          mail to: 'team@company.com',
          subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
          body: "Your build completed, please check: ${env.BUILD_URL}"
     }
}
}          







