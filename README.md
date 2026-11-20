# Minecraft Forge 1.20.1 starter mod

A minimal Forge mod project targeting Minecraft 1.20.1 and Forge 47.2.0. It currently registers the mod entry point only; tell me what features you want next and we can add them before building.

## Requirements

- Java 17 JDK
- Gradle 8.1.1 or newer (ForgeGradle will resolve the Minecraft and Forge dependencies)

## Open the project

Import this repository as a Gradle project in IntelliJ IDEA or Eclipse. Gradle will download the declared Forge/Minecraft dependencies during project sync. No build or compilation has been run.

For command-line setup, with Gradle installed, run `gradle genIntellijRuns` or `gradle genEclipseRuns` for your IDE. To launch a development client later, use the generated `runClient` task. Do not run a build task until you're ready to compile.

The Forge and Minecraft dependency artifacts are resolved by Gradle rather than checked into the repository.
