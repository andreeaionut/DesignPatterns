package builders;

import core.Coffee;

public interface CoffeeBuilder {
    void buildName();
    void buildIngredients();
    Coffee getCoffee();
}
