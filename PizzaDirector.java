public final class PizzaDirector {
    private PizzaDirector() { /* static helper */ }

    public static Pizza makeMargherita(Pizza.Size size) {
        return new Pizza.Builder()
                .setSize(size)
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .addTopping("Basil")
                .build();
    }

    public static Pizza makePepperoni(Pizza.Size size) {
        return new Pizza.Builder()
                .setSize(size)
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .addTopping("Pepperoni")
                .build();
    }
}

