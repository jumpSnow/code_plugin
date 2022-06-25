package com.github.jumpsnow.codeplugin.services

import com.intellij.openapi.project.Project
import com.github.jumpsnow.codeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
