package com.ms.square.plugins.gradle.glsl

import org.gradle.api.Project

class GlslExtension {

    // Package name for the output
    private String outputPackage

    // Output Directory Path
    private String outputDirPath

    GlslExtension(Project project) {

    }

    void outputPackage(String outputPackage) {
        this.outputPackage = outputPackage
    }

    String getOutputPackage() {
        return outputPackage
    }

    void outputDirPath(String outputDirPath) {
        this.outputDirPath = outputDirPath
    }

    String getOutputDirPath() {
        return outputDirPath
    }
}