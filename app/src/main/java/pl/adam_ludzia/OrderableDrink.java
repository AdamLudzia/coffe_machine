package pl.adam_ludzia;

public class OrderableDrink {

    public static final OrderableDrink CAPPUCCINO =
        new OrderableDrink(
            DrinkTypes.CAPPUCCINO,
            new Money(15));

    public static final OrderableDrink LATE =
        new OrderableDrink(
            DrinkTypes.LATE,
            new Money(20));

    public static final OrderableDrink ESPRESSO =
        new OrderableDrink(DrinkTypes.ESPRESSO,
            new Money(10));

    private DrinkTypes drinkType;
    private Money price;

    public OrderableDrink(DrinkTypes drinkType, Money price) {
        this.drinkType = drinkType;
        this.price = price;
    }

    public DrinkTypes getDrinkType() {
        return drinkType;
    }

    public Money getPrice() {
        return price;
    }
}
