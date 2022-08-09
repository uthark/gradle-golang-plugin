package io.github.uthark.gradle.plugin.golang

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input

public abstract class GolangExtension {

    @get:Input
    abstract val pkg: Property<String>
    init {
        pkg.convention("main.go")
    }
}
