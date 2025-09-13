import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
public final class Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(builder.toppings));
    }

    public Size getSize() { return size; }
    public String getSauce() { return sauce; }
    public String getCheese() { return cheese; }
    public List<String> getToppings() { return toppings; }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                '}';
    }
    public static class Builder {
        private Size size;
        private String sauce;
        private String cheese = "Mozzarella";
        private final List<String> toppings = new ArrayList<>();

        public Builder setSize(Size size) {
            this.size = Objects.requireNonNull(size, "size must not be null");
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = Objects.requireNonNull(sauce, "sauce must not be null").trim();
            if (this.sauce.isEmpty()) throw new IllegalArgumentException("sauce must not be empty");
            return this;
        }

        public Builder setCheese(String cheese) {
            this.cheese = Objects.requireNonNull(cheese, "cheese must not be null").trim();
            if (this.cheese.isEmpty()) throw new IllegalArgumentException("cheese must not be empty");
            return this;
        }

        public Builder addTopping(String topping) {
            if (topping != null && !topping.trim().isEmpty()) {
                this.toppings.add(topping.trim());
            }
            return this;
        }

        public Pizza build() {
            if (this.size == null) {
                throw new IllegalStateException("Size is required");
            }
            if (this.sauce == null || this.sauce.isEmpty()) {
                throw new IllegalStateException("Sauce is required");
            }
            return new Pizza(this);
        }
    }
}
