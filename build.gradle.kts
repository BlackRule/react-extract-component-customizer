// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

plugins {
//  id("java") Shouldn't be for NON IDEA (for PS , WS)
  id("org.jetbrains.intellij") version "1.16.0"

}

group = "org.intellij.sdk"
version = "2.0.0"

repositories {
  mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
}

// See https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
  type.set("IU")
  localPath.set("C:\\Apps\\JetBrains\\Toolbox\\PhpStorm 3")
//  version.set("2022.3.3")
  plugins.set(listOf("JavaScript"))
}



tasks {
  buildSearchableOptions {
    enabled = false
  }

  patchPluginXml {
    version.set("${project.version}")
    sinceBuild.set("223")
    untilBuild.set("233.*")
  }

  runIde{
    ideDir.set(file("C:\\Apps\\JetBrains\\Toolbox\\PhpStorm 3"))
  }
}
