# Builder Pattern Example: Customer Class
This project showcases a practical implementation of the **Builder Pattern** in Java, using a `Customer` class as an example. The Builder Pattern is used to simplify the creation of complex objects by dividing the construction process into smaller, manageable steps.
## Features
- Demonstrates how to use the Builder Pattern to create objects with a mix of mandatory and optional fields.
- Makes the creation process more readable and avoids long, telescoping constructors.
- Provides an immutable `Customer` object that is initialized through the `CustomerBuilder` class.
- Real-world scenario: Managing customer data with required and optional attributes.

## Prerequisites
- **Java 15** or higher.

## Architecture Overview
### **`Customer` Class**
- This is the main object being created.
- Contains:
    - **Required fields**: `firstName`, `lastName`.
    - **Optional fields**: `email`, `phone`, and `address`.

- Designed as immutable – its state cannot be changed after initialization.

### **`CustomerBuilder` Class**
- An inner static class inside `Customer`.
- Responsible for the step-by-step creation of a `Customer` object.
- Provides:
    - A constructor to initialize required fields.
    - Chainable setter methods (e.g., `email()`, `phone()`, `address()`) for optional fields.
    - A `build()` method to generate the `Customer` object.

## Workflow
1. **Instantiate the Builder**: Use `new Customer.CustomerBuilder(firstName, lastName)` to create the builder and provide the required fields.
2. **Add Optional Fields**: Call methods like `.email()`, `.phone()`, and `.address()` to set optional fields. These methods return the builder itself for method chaining.
3. **Build the Object**: Call `.build()` to construct the immutable `Customer` object.

## Code Example
### Creating a Customer with All Fields
``` java
Customer customer = new Customer.CustomerBuilder("John", "Doe")
        .email("john.doe@example.com")
        .phone("123-456-7890")
        .address("123 Main Street, City, Country")
        .build();

System.out.println(customer);
```
### Creating a Customer with Required Fields Only
``` java
Customer customer = new Customer.CustomerBuilder("Alice", "Smith").build();
System.out.println(customer);
```
### Expected Output
``` plaintext
Customer {firstName='John', lastName='Doe', email='john.doe@example.com', phone='123-456-7890', address='123 Main Street, City, Country'}
Customer {firstName='Alice', lastName='Smith', email='null', phone='null', address='null'}
```
## Advantages of Builder Pattern in This Example
- **Readability**: Clearly separates mandatory and optional fields during object creation.
- **Immutability**: The `Customer` object is immutable, ensuring its fields cannot be altered after creation.
- **Flexibility**: You can easily add new optional fields to the `Customer` class without breaking changes to the larger application.

## How to Run the Code
1. Clone the repository:
``` bash
   git clone <repository-url>
```
1. Open the project in your favorite IDE (e.g., IntelliJ IDEA).
2. Build and run the `BuilderPatternInJavaRealTime` class to test the usage of the **Builder Pattern**.

## Flow Chart : 
![image](https://github.com/user-attachments/assets/d8fe5d27-f4d7-4aed-9ea4-ee7d3c62af38)


## License
This project is licensed under the [MIT License](LICENSE).
## Contribution
Feel free to submit a pull request or suggest improvements to extend this project further.
