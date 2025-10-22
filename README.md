# Simple POS MVP

A simplified MVP version of [Solite-POS](https://github.com/denisyordanp/Solite-POS) focusing on basic product management.

## Features

- ✅ View products in a list
- ✅ Add new products
- ✅ Jetpack Compose UI
- ✅ Room Database for local storage
- ✅ Hilt Dependency Injection
- ✅ MVVM Architecture

## Tech Stack

- **Kotlin** - Programming language
- **Jetpack Compose** - Modern UI toolkit
- **Room** - Local database
- **Hilt** - Dependency injection
- **Coroutines** - Asynchronous programming
- **ViewModel** - UI state management

## Architecture

- MVVM (Model-View-ViewModel) pattern
- Clean Architecture principles
- Modular structure (app, data, domain, common)

## Requirements

- Android Studio Flamingo or later
- Minimum SDK: 23 (Android 6.0)
- Target SDK: 33 (Android 13)
- Kotlin 1.7.10

## Getting Started

1. Clone the repository:
```bash
git clone https://github.com/gitmvp-com/simple-pos-mvp.git
```

2. Open the project in Android Studio

3. Sync Gradle files

4. Run the app on an emulator or device

## Project Structure

```
simple-pos-mvp/
├── app/              # Main application module
├── domain/           # Business logic layer
├── data/             # Data layer (Room, repositories)
├── common/           # Shared utilities and models
└── buildSrc/         # Build configuration
```

## License

MIT License - Feel free to use this project for learning purposes.

## Credits

Inspired by [Solite-POS](https://github.com/denisyordanp/Solite-POS) by denisyordanp
