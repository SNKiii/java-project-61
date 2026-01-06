plugins {
    id("java")
    id("application")
    id("org.sonarqube") version "7.2.2.6593"
//    id("checkstyle")
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
//checkstyle {
//    toolVersion = "10.12.4"
//}
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}