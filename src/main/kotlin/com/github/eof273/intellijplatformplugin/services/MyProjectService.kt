package com.github.eof273.intellijplatformplugin.services

import com.github.eof273.intellijplatformplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
