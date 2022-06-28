package com.github.ake2255.jea.services

import com.intellij.openapi.project.Project
import com.github.ake2255.jea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
