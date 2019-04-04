package builders;

import core.Coffee;
import core.CoffeeIngredient;

public class CappuccinoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    @Override
    public void buildName() {
        this.coffee.setName("americano");
    }

    @Override
    public void buildIngredients() {
        CoffeeIngredient coffeeIngredient = new CoffeeIngredient();
        coffeeIngredient.setQuantity(2);
        coffeeIngredient.setUnit("cups");
        coffeeIngredient.setIngredient("water");
        this.coffee.addIngredient(coffeeIngredient);

        coffeeIngredient = new CoffeeIngredient();
        coffeeIngredient.setQuantity(0.25);
        coffeeIngredient.setUnit("cups");
        coffeeIngredient.setIngredient("coffee-beans");
        coffeeIngredient.setType("roasted");
        this.coffee.addIngredient(coffeeIngredient);

        coffeeIngredient = new CoffeeIngredient();
        coffeeIngredient.setQuantity(100);
        coffeeIngredient.setUnit("ml");
        coffeeIngredient.setIngredient("milk");
        coffeeIngredient.setType("foamed");
        this.coffee.addIngredient(coffeeIngredient);
    }

    @Override
    public Coffee getCoffee() {
        return this.coffee;
    }
}
