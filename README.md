Pizza Builder (Java)
This project demonstrates the Builder design pattern using a Pizza product in Java.
It was created as part of an assignment on design patterns and Clean Code principles.
Features
Immutable Pizza object with nested Builder.
Method chaining for easy object creation.
Validation for required fields (size, sauce).
Default values (e.g., "Mozzarella" cheese).
Example predefined pizzas in PizzaDirector (Margherita, Pepperoni).
Demonstration in Main.java.
Project structure
src/Pizza.java — product and builder class.
src/PizzaDirector.java — defines standard pizza recipes.
src/Main.java — demo program.
REPORT.md — detailed report.
How to run
Option 1: IntelliJ IDEA (recommended)
Open the project in IntelliJ IDEA.
Run Main.java (green play button).
The console will show sample pizzas.
Option 2: Command line
Compile:
javac src/Pizza.java src/PizzaDirector.java src/Main.java -d out
Run:
java -cp out Main
Author
Sabina Zhumagaliyeva
