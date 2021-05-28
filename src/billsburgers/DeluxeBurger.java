package billsburgers;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe hamburger", "Sausage & Bacon", 14.54, "White roll");
    }

    private final String info = "Cannot not add additional items to a deluxe burger";
    private final double chipsPrice = 2.75;
    private final double drinkPrice = 1.81;
    private final double totalPrice = chipsPrice + drinkPrice + super.itemizeHamburger();

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(info);
        System.out.println("Added Chips for an extra " + chipsPrice);
        System.out.println("Added Drink for an extra " + drinkPrice);
        System.out.println("Total Deluxe Burger price is " + totalPrice);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(info);
        System.out.println("Added Chips for an extra " + chipsPrice);
        System.out.println("Added Drink for an extra " + drinkPrice);
        System.out.println("Total Deluxe Burger price is " + totalPrice);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(info);
        System.out.println("Added Chips for an extra " + chipsPrice);
        System.out.println("Added Drink for an extra " + drinkPrice);
        System.out.println("Total Deluxe Burger price is " + totalPrice);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(info);
        System.out.println("Added Chips for an extra " + chipsPrice);
        System.out.println("Added Drink for an extra " + drinkPrice);
        System.out.println("Total Deluxe Burger price is " + totalPrice);
    }

}
