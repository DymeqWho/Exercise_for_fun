package billsburgers;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Cheese", 1.2);
        System.out.println("Total price for Hamburger is " + hamburger.itemizeHamburger());

        Hamburger healthBurger = new HealthyBurger("Hummingbird wings", 10.44);
        healthBurger.addHamburgerAddition1("pork meet", 2.2);
        System.out.println("Total price for Health Burger is " + healthBurger.itemizeHamburger());

        Hamburger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("should not do that", 1111.1111);
        deluxeBurger.itemizeHamburger();
    }
}
