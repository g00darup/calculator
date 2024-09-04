# Extensible Calculator

## Overview
This project implements an extensible calculator in Java using Spring Boot. The calculator supports basic arithmetic operations like addition, subtraction, multiplication, and division, and is designed to be easily extended to support additional operations in the future.

## Features
- **Basic Operations**: Supports addition, subtraction, multiplication, and division.
- **Chaining Operations**: Allows users to chain multiple operations on a single value, similar to a basic calculator.
- **Extensibility**: The design follows the Open-Closed Principle, enabling new operations to be added without modifying the existing code in the `Calculator` class.
- **IoC Compatibility**: The implementation is compatible with an Inversion of Control environment using Spring's Dependency Injection.
- **Error Handling**: Handles invalid operations and division by zero gracefully.
- **Unit Tests**: Comprehensive unit tests are provided to verify functionality and edge cases.

## Requirements
- **Java 17**
- **Maven**
- **Spring Boot**

## Installation
1. unzip the calculator.zip
   cd calculator
2. Issue command
   ```mvn clean install```
3. Followed by ```mvn spring-boot:run```
4. To run unit tests, run ```mvn test```
