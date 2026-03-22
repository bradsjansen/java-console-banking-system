# Java Console Banking System

A console-based banking application built in Java, designed to demonstrate 
core Object-Oriented Programming principles and clean software architecture.

## Tech Stack
- Java
- IntelliJ IDEA

## Architecture
This project follows a layered architecture with clear separation of responsibilities:
- **Account** — models a bank account with encapsulated balance management
- **Bank** — handles account management and transaction coordination  
- **Transaction** — represents a single transaction event with type, amount and date
- **Main** — entry point, manages user interaction via console menu

## Features (In Progress)
- [x] Create a bank account
- [x] Deposit funds
- [x] Withdraw funds
- [x] View account balance
- [x] Input validation
- [x] Duplicate account prevention
- [x] Transaction history
- [x] Account holder name

## Concepts Practiced
- Object-Oriented Programming (Encapsulation, Abstraction)
- Class design and responsibility separation
- Console I/O with Scanner
- Guard clause pattern for early returns
- ArrayList for in-memory data storage
- Layered architecture (Main → Bank → Account → Transaction)

## Related Project
This console app served as the foundation for a REST API version built 
with Spring Boot and MySQL — see [java-banking-api](https://github.com/bradsjansen/java-banking-api)

## How to Run
1. Clone the repo
2. Open in IntelliJ IDEA
3. Run `Main.java`
