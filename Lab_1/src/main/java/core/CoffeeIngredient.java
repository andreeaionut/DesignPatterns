package core;

import java.util.Objects;

public class CoffeeIngredient {
    private double quantity;
    private String unit;
    private String ingredient;
    private String type;

    public CoffeeIngredient() {
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CoffeeIngredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeIngredient that = (CoffeeIngredient) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingredient, that.ingredient) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(quantity, unit, ingredient, type);
    }
}
