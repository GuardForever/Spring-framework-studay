plugins {
    id("java")
}

group = "org.springframework"
version = "5.2.6.RELEASE"

repositories {
    mavenCentral()
}

dependencies {
	implementation(project(mapOf("path" to ":spring-context")))
	compile(project(":spring-beans"))
	compile(project(":spring-core"))
	compile(project(":spring-context"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}