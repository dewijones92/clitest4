plugins {
    id("clitest4.kotlin-application-conventions")
}

val ktor_version="2.2.4";
val koin_version="3.3.3";

// Use KSP Generated sources
sourceSets.main {
    java.srcDirs("build/generated/ksp/main/kotlin")
}
sourceSets.test {
    java.srcDirs("build/generated/ksp/test/kotlin")
}


dependencies {
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.insert-koin:koin-ktor:3.3.1")
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation(kotlin("test"))
}
tasks.test {
    useJUnitPlatform()
}


application {
    // Define the main class for the application.
    mainClass.set("scraper.ScraperKt")
}
