// def call(String command){
//     sh("./mvnw ${command}")
// }

def call(List commands){
    for (command in commands){
        sh("./mvnw ${command}")
    }
}