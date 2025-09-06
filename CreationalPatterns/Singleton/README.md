## Singleton Design - Pizza Restaurant
![Singleton](Singleton.png)

# Overview
- Class has only one instance with global access to that instance.
Example - Loggers, thread pools, connection pools, caches, etc.

# Problem
- How to ensure a class has only one instance?
- How to provide a single global access point?

# Solution
- Private Constructor + Static creation method that acts as the constructor.
- Various implementations allow for thread-safe usage such as using enum, or static class to manage instance or eager initialization, etc.

# Applicability
- When a class should have only a single instance available to all clients.
- When we need stricter control over global variables.

# Implementation
1. Add a private static field for storing the single instance.
2. Create a public static creation method to get the singleton instance.
3. Make the constructor private and call it from the static creation method on first call or as required for thread-safe implementation.

# Benefits and Pitfalls
Benefits:
- Ensures only one instance of class.
- Global access to the instance.

Pitfalls:
- Violation of SRP: It manages both the lifecycle and the business logic.
- Required special handing in case of multi-threading.
- Difficult to create unit tests as constructor is private so mocking fails.

# Relation with Other Patterns
- Other creational patterns like builder, prototype and abstract factory can be implemented as singletons.