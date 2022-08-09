plugins {
    id("io.github.uthark.gradle.plugin.golang")
}

golang {
    pkg.set("test.go")
}
