/* ########################################################################## */
/*                                                                            */
/*  SPDX-License-Identifier: UNLICENSED                                       */
/*  See LICENSE.txt for full license terms (FR/EN).                           */
/*                                                                            */
/*  Author: Charles Theetten                                                  */
/*                                                                            */
/* ########################################################################## */

group           = "io.chasthn.spaceinvaders"
version         = "1.0.0"

/* ########################################################################## */

val targetDir   = "${projectDir}/target"
val program     = "spaceInvaders"

/* ########################################################################## */

plugins {
    application
    id("org.openjfx.javafxplugin")  version "0.1.0"
    id("org.beryx.jlink")           version "3.2.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass                   = "io.chasthn.spaceinvaders.SpaceInvaders"
    mainModule                  = "spaceinvaders"
    applicationDefaultJvmArgs   = listOf(
        "--enable-native-access=javafx.graphics",
        "--enable-native-access=javafx.media"
    )
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

javafx {
    version = "25"
    modules("javafx.base", "javafx.controls", "javafx.graphics", "javafx.media")
}

jlink {
    options.set(listOf("--strip-debug", "--compress=2", "--no-header-files", "--no-man-pages"))

    launcher {
        name            = program
    }

    jpackage {
        skipInstaller   = true
        imageName       = program
        appVersion      = "1.0.0"
        outputDir       = file(targetDir).absolutePath
        jpackageHome    = (System.getenv("JAVA_HOME")
                          ?: error("JAVA_HOME must point to a full JDK to build with Gradle jpackage."))
    }
}

/* ########################################################################## */

tasks.named<Delete>("clean") {
    delete(targetDir)
}

tasks.named<Jar>("jar") {
    archiveBaseName.set(rootProject.name)
    destinationDirectory.set(file(targetDir))

    manifest {
        attributes["Main-Class"] = "io.chasthn.spaceinvaders.SpaceInvaders"
    }
}

tasks.register<Zip>("packageZip") {
    dependsOn("jpackage")

    archiveBaseName.set(rootProject.name)
    archiveVersion.set(project.version.toString())
    archiveExtension.set("zip")
    destinationDirectory.set(file(targetDir))

    from("${targetDir}/${rootProject.name}") {
        into(rootProject.name)
    }

    doLast {
        delete("${targetDir}/${rootProject.name}")
    }
}

/* ########################################################################## */
