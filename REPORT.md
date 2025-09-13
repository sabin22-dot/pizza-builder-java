# REPORT — Pizza Builder (Java)

## Task
Implement the Builder design pattern for a `Pizza` product in Java, following Clean Code principles.

## Project structure
- `src/`  
  - `Pizza.java` — immutable product and nested `Builder`.
  - `PizzaDirector.java` — optional Director providing standard configurations.
  - `Main.java` — demonstration usage (creates examples and prints them).
- `REPORT.md` — this document.
- `README.md` — build and run instructions.

## Implementation summary
- `Pizza` is designed as an immutable object.  
- The `Builder` is a static nested class that supports method chaining.  
- Validation is performed: `size` and `sauce` are required fields.  
- Default value for cheese is `"Mozzarella"`.  
- Toppings are stored as an unmodifiable list to preserve immutability.  
- `PizzaDirector` demonstrates predefined pizzas (Margherita, Pepperoni).

## Clean Code principles applied
1. **Meaningful names**: methods like `setSize`, `addTopping`, `makeMargherita` clearly describe actions.  
2. **Small single-purpose methods**: each method has one clear responsibility.  
3. **Immutable product**: `final` fields, no setters, unmodifiable list.  
4. **Validation**: `Objects.requireNonNull` and checks in `build()` prevent invalid objects.  
5. **Separation of concerns**: `Pizza` holds data, `Builder` constructs, `PizzaDirector` defines presets.

## How to compile and run
1. Compile:
   javac src/Pizza.java src/PizzaDirector.java src/Main.java -d out
2. Run:
   java -cp out Main

## Repository link
https://github.com/sabin22-dot/pizza-builder-java

## Author
Sabina Zhumagaliyeva
