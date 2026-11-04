plugins {
    kotlin("jvm") version "2.0.21"
    application
}

repositories {
    mavenCentral()
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
