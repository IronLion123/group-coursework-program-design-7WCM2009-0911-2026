plugins {
    kotlin("jvm") version "2.4.0"
    application
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(25)
}

sourceSets {
    main {
        kotlin.srcDirs("src")
    }
}

application {
    mainClass.set("ppdCliTool.MainKt")
    applicationName = "ppd_cli_tool"
}
