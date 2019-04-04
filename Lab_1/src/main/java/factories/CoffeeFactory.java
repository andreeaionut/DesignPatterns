package factories;

import core.Coffee;
import core.CoffeeIngredient;
import services.CoffeeService;

import java.util.ArrayList;
import java.util.List;

public class CoffeeFactory {

    private List<Coffee> basicCoffees = new ArrayList<>();
    private CoffeeService coffeeService;

    public CoffeeFactory(){
        this.coffeeService = new CoffeeService();
        this.basicCoffees = coffeeService.getEntitiesFromFile();
    }

    public Coffee getCoffeeFromIngredients(List<CoffeeIngredient> coffeeIngredients){
        for(Coffee coffee : this.basicCoffees){
            if(coffee.getIngredients().size() == coffeeIngredients.size()){
                for(CoffeeIngredient coffeeIngredient : coffeeIngredients){
                    if(!coffee.getIngredients().contains(coffeeIngredient)){
                        break;
                    }
                }
                return coffee;
            }
        }
        return null;
    }

}
