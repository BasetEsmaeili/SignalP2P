

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
# SignalP2P
SignalP2P is a simple WiFi P2P chat application built based on the [libsignal](https://github.com/signalapp/libsignal), the Signal Messenger app open-source secure protocol.

The application structure is P2P-based, which means that you must be connected to the same network as the other participants.
Everything is stored encrypted on user devices, and we don't have any server connection, so we don't need an internet connection. However, if you want some features like sending location or gifs, you must have internet access.

**Status:  🚧  In progress**

SignalP2P is still in under development, and some features are not yet implemented.
Today, unfortunately, I am very busy and this is the university project that I have to deliver, so I plan to refactor the project when I have more time.
# Features
* Send and receive encrypted messages.
* Create groups.
* Tag a member of the groups.
* Send files.
* Send location.
* Send gifs.
# Technologies
- [Kotlin](https://kotlinlang.org)
- [AndroidX](https://developer.android.com/jetpack/androidx)
- [Android Jetpack](https://developer.android.com/jetpack)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Material Design 3](https://m3.material.io)
- [Dagger Hilt](https://dagger.dev/hilt)
- [Protobuf](https://protobuf.dev)
- [Realm Database](https://realm.io/)
- [Kotlin Serialization](https://github.com/Kotlin/kotlinx.serialization)
- [Data Store](https://developer.android.com/topic/libraries/architecture/datastore)
- [LeakCanary](https://github.com/square/leakcanary)
- [Coil](https://github.com/coil-kt/coil)
- [Detekt](https://github.com/detekt/detekt)
- [Ktlint](https://pinterest.github.io/ktlint/0.49.1)
# Development Environment
**SignalP2P**  uses the Gradle build system and can be imported directly into Android Studio (make sure you are using the latest stable version available  [here](https://developer.android.com/studio)).
# Architecture
The  **SignalP2P**  app follows the  [official architecture guidance.](https://developer.android.com/topic/architecture)
# Build
The app contains the usual  `debug`  and  `release`  build variants.
# UI
The app was designed using  [Material 3 guidelines](https://m3.material.io/) based on [Jetchat](https://github.com/android/compose-samples/tree/main/Jetchat) application.
The Screens and UI elements are built entirely using  [Jetpack Compose](https://developer.android.com/jetpack/compose).
# TODO
* Implement remaining features.
* Refactor project to module by feature.
#  Run Project
Clone the project
```bash
git clone https://github.com/BasetEsmaeili/SignalP2P.git
```
Go to the project directory
```bash
cd SignalP2P
```
# Contributing
Contributions are most welcome to SignalP2P. You can contribute in various ways such as reporting issues, suggesting features, adding documentation and providing bug fixes.
# Licence
**SignalP2P** is distributed under the terms of the Apache License (Version 2.0). See the [license](https://github.com/BasetEsmaeili/SignalP2P/blob/main/LICENSE) for more information.