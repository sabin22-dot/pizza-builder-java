public class Main {
    public static void main(String[] args) {
        Pizza custom = new Pizza.Builder()
                .setSize(Pizza.Size.LARGE)
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .addTopping("Pepperoni")
                .addTopping("Olives")
                .addTopping("Mushrooms")
                .build();
        Pizza marg = PizzaDirector.makeMargherita(Pizza.Size.MEDIUM);
        Pizza pep = PizzaDirector.makePepperoni(Pizza.Size.SMALL);
        System.out.println("Custom: " + custom);
        System.out.println("Margherita: " + marg);
        System.out.println("Pepperoni: " + pep);
    }
}