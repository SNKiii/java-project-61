plugins {
    id("application")
    id("org.sonarqube") version "7.2.2.6593"
    id("checkstyle")
}
sonar {
    properties {
        property("sonar.projectKey", "SNKiii_java-project-61")
        property("sonar.organization", "snkiii")
    }
}
application{
    mainClass.set("hexlet.code.App")
}
checkstyle {
    toolVersion = "10.12.4"
    configFile = file("${project.rootDir}/app/config/checkstyle/checkstyle.xml")
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}