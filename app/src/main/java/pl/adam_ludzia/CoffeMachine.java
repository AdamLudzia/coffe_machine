package pl.adam_ludzia;

public class CoffeMachine {
    private final DrinkMaker drinkMaker;
    private final OrderChecker orderChecker;
    private final MoneyChecker moneyChecker;
    private final OrderImpl orderImpl;
    private final ItemsQuantityChecker itemsQuantityChecker;

    public CoffeeMachine(
        DrinkMaker drinkMaker,
        OrderChecker orderChecker,
        MoneyChecker moneyChecker,
        ItemsQuantityChecker itemsQuantityChecker,
    ) {
        this.drinkMaker = drinkMaker;
        this.orderChecker = orderChecker;
        this.moneyChecker = moneyChecker;
        this.itemsQuantityChecker = itemsQuantityChecker;
        this.orderImpl = new OrderImpl();
    }

    public String serveOrder() {
        Order order = orderChecker.readInput();

        if(itemsQuantityChecker.isEmpty(order.getDrinkType().toString())) {
           return "Brak możliwości realizacji zamówienia";
        }
        return null;
    }
}
