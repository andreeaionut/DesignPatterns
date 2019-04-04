package builders;

import core.CoffeeIngredient;

public interface CoffeePlan {
    void setName(String name);
    void addIngredient(CoffeeIngredient ingredient);
}
