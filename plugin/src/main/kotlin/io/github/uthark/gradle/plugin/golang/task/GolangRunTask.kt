package io.github.uthark.gradle.plugin.golang.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.process.internal.ExecActionFactory
import org.gradle.work.DisableCachingByDefault
import javax.inject.Inject

@DisableCachingByDefault(because = "Application should always run")
abstract class GoRun : DefaultTask() {

    @get:Input
    abstract var pkg: String

    @Inject
    abstract fun getExecActionFactory(): ExecActionFactory?

    @TaskAction
    fun greet() {
        val execAction = getExecActionFactory()?.newExecAction() ?: throw RuntimeException("no exec action")
        execAction.executable = "go"
        execAction.environment = System.getenv() as Map<String, Any>?
        execAction.args = mutableListOf("run", pkg)
        execAction.standardOutput = System.out
        execAction.errorOutput = System.err
        val result = execAction.execute()
    }
}
