import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliverForNumber(1);
        coffeeOrderBoard.add("Olga");
        coffeeOrderBoard.deliverForNumber(3);
        coffeeOrderBoard.add("Anna");
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.add("Viktor");
        coffeeOrderBoard.deliverForNumber(2);
        coffeeOrderBoard.add("Dima");
        coffeeOrderBoard.add("Marija");
        coffeeOrderBoard.add("Max");
        coffeeOrderBoard.deliverForNumber(4);
        coffeeOrderBoard.draw();
    }

}
