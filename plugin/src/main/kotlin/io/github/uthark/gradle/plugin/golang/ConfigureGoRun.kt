package io.github.uthark.gradle.plugin.golang

import io.github.uthark.gradle.plugin.golang.task.GoRun
import org.gradle.api.Action

class ConfigureGoRun : Action<GoRun> {
    override fun execute(t: GoRun) {
        println("executing $t")

    }
}
