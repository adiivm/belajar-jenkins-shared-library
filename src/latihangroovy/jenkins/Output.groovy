package latihangroovy.jenkins

// Classes used in Jenkins shared libraries should implement Serializable
class Output implements Serializable {

    // This will hold the Jenkins pipeline context
    private def steps

    // Constructor to receive 'this' from Jenkinsfile
    Output(steps) {
        this.steps = steps
    }

    // Non-static method using steps.echo
    def hello(String name) {
        steps.echo "Hello ${name}"
    }
}
