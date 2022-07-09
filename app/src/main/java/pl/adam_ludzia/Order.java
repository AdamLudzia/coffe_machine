package pl.adam_ludzia;

public class Order {

    private OrderableDrink drink;
    private int sugarQuantity;
    private int milkQuantity;

    public Order(OrderableDrink drink) {
        this.drink = drink;
        this.sugarQuantity = 0;
        this.milkQuantity = 0;
    }

    public void addSugar() {
        this.sugarQuantity ++;
    }

    public void addMilk() {
        this.milkQuantity ++;
    }

    public OrderableDrink getDrink() {
        return drink;
    }

    public DrinkTypes getDrinkType() {
        return drink.getDrinkType();
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }
}
