# JetPack Compact

A simple Android app using Jetpack Compose and modern Gradle Kotlin DSL configuration.

## Project details

- Android Gradle project with a single module: `:app`
- Kotlin + Jetpack Compose UI
- Minimum SDK: 26
- Target/Compile SDK: 34
- Application ID: `com.example.jetpackcompact`

## Requirements

- JDK 17 or later
- Android SDK with API level 34
- Gradle wrapper (`./gradlew` / `gradlew.bat`)

## Build

From the project root:

```bash
./gradlew assembleDebug
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

## Notes

This project is configured with Compose and includes AndroidX libraries via `libs.versions.toml`. The release build currently disables ProGuard minification.
