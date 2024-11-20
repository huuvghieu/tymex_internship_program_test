# Currency Converter - Android Compose Multi-Module Project

Currency Converter is an Android project built using Jetpack Compose and follows a clean architecture.

## Modules

The project is structured into the following modules:

1. **data**: Contains data-related classes and interfaces, such as repositories and data sources. Handles database interactions, including Room database setup and DAOs.
2. **di**: Centralizes object creation and improves testability and decoupling of components.
3. **domain**: Contains domain-specific classes and business logic, including use cases and domain models.
4. **presentation**: Defines common models used across the application.

## Features

- Currency conversion: Convert currency from one to another with real-time exchange rates.
- Jetpack Compose UI: Utilize the Jetpack Compose toolkit to build a modern and reactive user interface.
- Clean architecture: Separate concerns into different modules for better code organization and maintainability.
- Data persistence: Store and retrieve currency data using Room database.
- Network calls: Fetch real-time exchange rates from an external API.

## Getting Started

To get started with the Currency Converter project, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/huuvghieu/tymex_internship_program_test.git
   ```

2. Import the project into Android Studio.

3. Build and run the application.

## Dependencies

The Currency Converter project uses the following dependencies:

- Jetpack Compose: For building the modern UI.
- Room: For local database setup and data persistence.
- Retrofit: For making network API calls.
- Coroutines: For asynchronous programming and concurrency handling.

## Testing

The `test` module contains unit tests for different modules to ensure code correctness and reliability.

## Video demonstrating

https://github.com/huuvghieu/tymex_internship_program_test/blob/main/CurrencyConverterApp/assets/demo_currency_converter_app.mp4
