# JetPack Compact

A simple Android app using Jetpack Compose and modern Gradle Kotlin DSL configuration.

## Project details

- Single app module: `:app`
- Kotlin + Jetpack Compose UI
- Android Gradle Plugin: `9.3.1`
- Kotlin: `2.2.10`
- Compile SDK: `36`
- Target SDK: `36`
- Minimum SDK: `26`
- Build tools: `36.1.0`
- NDK version: `28.2.13676358`
- Application ID: `com.example.jetpackcompact`
- Namespace: `com.example.jetpackcompact`

## Requirements

- JDK 17 or later
- Android SDK platform 36
- Gradle wrapper (`./gradlew` / `gradlew.bat`)

## Build

From the project root:

```bash
./gradlew assembleDebug
```

For release builds:

```bash
./gradlew assembleRelease
```

## Run

Install and run on an Android device or emulator:

```bash
./gradlew installDebug
```

## Test

Run unit tests:

```bash
./gradlew test
```

Run instrumentation tests:

```bash
./gradlew connectedAndroidTest
```

## Dependency management

- Uses `gradle/libs.versions.toml` for library and plugin versions
- Compose BOM managed via `androidx.compose:compose-bom`
- Includes AndroidX Core, Lifecycle, Activity Compose, Material3, and identity-doctypes dependencies

## Notes

- Compose is enabled in `app/build.gradle.kts`
- Release build minification is disabled (`isMinifyEnabled = false`)
- Packaging excludes `/META-INF/{AL2.0,LGPL2.1}` license files
