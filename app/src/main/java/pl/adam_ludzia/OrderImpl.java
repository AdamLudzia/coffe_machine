package pl.adam_ludzia;

public class OrderImpl {
    public String adapt(Order order) {
        return extractDrink(order) +
            ":" + extractSugar(order) +
            ":" + extractMilk(order);
    }
    private String extractDrink(Order order) {
        switch (order.getDrinkType()) {
            case ESPRESSO:
                return "E";
            case CAPPUCCINO:
                return "C";
            case LATE:
                return "L";
            default:
                return "";
        }
    }

    private String extractSugar(Order order) {
        if (order.getSugarQuantity() == 0) {
            return "";
        }

        return String.valueOf(order.getSugarQuantity());
    }

    private String extractMilk(Order order) {
        if (order.getMilkQuantity() == 0) {
            return "";
        }

        return String.valueOf(order.getMilkQuantity());
    }
}
