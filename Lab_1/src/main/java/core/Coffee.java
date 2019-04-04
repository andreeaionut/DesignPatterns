package core;

import builders.CoffeePlan;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements CoffeePlan {
    private String name;
    private List<CoffeeIngredient> ingredients;

    public Coffee() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<CoffeeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<CoffeeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(CoffeeIngredient coffeeIngredient){
        this.ingredients.add(coffeeIngredient);
    }

    @Override
    public String toString() {
        String result = "Coffee{" +
                "name='" + name + '\'';
        for(CoffeeIngredient coffeeIngredient : this.ingredients){
            result = result.concat(coffeeIngredient.toString());
        }
        return result;
    }
}
