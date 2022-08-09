package io.github.uthark.gradle.plugin.golang

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

interface GolangExtension {

    @get:Input
    val pkg: Property<String>

}
