import core.Coffee;
import core.CoffeeIngredient;
import factories.CoffeeFactory;
import services.CoffeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        CoffeeService coffeeService = new CoffeeService();
        List<CoffeeIngredient> coffeeIngredients = coffeeService.getValidCoffeeIngredientsFromFile("src/main/resources/ingredients.csv");
        List<CoffeeIngredient> toCheck = new ArrayList<>();
        toCheck.add(coffeeIngredients.get(0));
        toCheck.add(coffeeIngredients.get(1));
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffeeFromIngredients(toCheck);
        System.out.println(coffee);
    }
}
