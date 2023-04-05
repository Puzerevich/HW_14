package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> coffeeOrder = new ArrayList<>();

    public void add(String name) {
        int number = 1;
        for (Order order : coffeeOrder) {
            number = order.getNumber() + 1;
        }
        coffeeOrder.add(new Order(number, name));
    }

    public void deliver() {
        if (coffeeOrder.isEmpty()) {
            System.out.println("In list no orders");
        } else {
            System.out.printf("%3d | %s\nOrder is ready\n", coffeeOrder.get(0).getNumber(),
                    coffeeOrder.get(0).getName());
            coffeeOrder.remove(0);
        }
    }

    public void deliverForNumber(int numberOrder) {
        if (coffeeOrder.isEmpty()) {
            System.out.println("In list no orders");
        } else {
            for (Order order : coffeeOrder) {
                if (order.getNumber() == numberOrder) {
                    System.out.printf("%3d | %s\nOrder is ready\n", order.getNumber(),
                            order.getName());
                    coffeeOrder.remove(order);
                    return;
                }
            }
            System.out.println("This number is not in the list");
        }
    }

    public void draw() {
        System.out.println("=".repeat(13));
        System.out.println("NUMBER | NAME");
        for (Order order : coffeeOrder) {
            System.out.printf("   %03d | %s\n", order.getNumber(), order.getName());
        }
    }
}
