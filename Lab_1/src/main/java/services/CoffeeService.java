package services;

import core.Coffee;
import core.CoffeeIngredient;
import factories.CoffeeFactory;
import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService {

    private List<Coffee> coffees = new ArrayList<>();

    public List<CoffeeIngredient> getValidCoffeeIngredientsFromFile(String filename){
        FileService fileService = FileService.getInstance();
        List<String> linesFromFile = fileService.getLinesFromFile(filename);
        List<CoffeeIngredient> coffeeIngredients = new ArrayList<>();
        for (String line:linesFromFile) {
            CoffeeIngredient coffeeIngredient = this.getValidCoffeeIngredientFromLine(line);
            if(coffeeIngredient != null){
                coffeeIngredients.add(coffeeIngredient);
            }
        }
        return coffeeIngredients;
    }

    private CoffeeIngredient getValidCoffeeIngredientFromLine(String line){
        String[] lineContent = line.split(",");
        CoffeeIngredient coffeeIngredient = null;
        if(lineContent.length == 3 || lineContent.length == 4){
            coffeeIngredient = this.createCoffeeIngredient(lineContent);
        }
        return coffeeIngredient;
    }

    private CoffeeIngredient createCoffeeIngredient(String[] content){
        CoffeeIngredient coffeeIngredient = new CoffeeIngredient();
        coffeeIngredient.setQuantity(Double.valueOf(content[0]));
        coffeeIngredient.setUnit(content[1]);
        coffeeIngredient.setIngredient(content[2]);
        if(content.length == 4){
            coffeeIngredient.setType(content[3]);
        }
        return coffeeIngredient;
    }

    public List<Coffee> getEntitiesFromFile(){
        List<Coffee> coffees = new ArrayList<>();
        List<String> fileContent = FileService.getInstance().getLinesFromFile("src/main/resources/coffees.csv");
        for (String line : fileContent){
            String[] splittedLine = line.split(":");
            Coffee coffee = new Coffee();
            coffee.setName(splittedLine[0]);
            String[] ingredients = splittedLine[1].split("\\+");
            for(String ingredient : ingredients){
                CoffeeIngredient coffeeIngredient = this.getValidCoffeeIngredientFromLine(ingredient);
                if(coffeeIngredient != null){
                    coffee.addIngredient(coffeeIngredient);
                }
            }
            coffees.add(coffee);
        }
        return coffees;
    }
}
