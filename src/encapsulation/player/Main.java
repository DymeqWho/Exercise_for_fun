package encapsulation.player;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.fullName = "Dima";
//        player.health = 20;
//        player.weapon = "bazooka";
//
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("player.healthRemaining() = " + player.healthRemaining());
//        damage = 11;
//        player.health = 11111;
//        player.loseHealth(damage);
//        System.out.println("player.healthRemaining() = " + player.healthRemaining());
//    }

        EnhancedPlayer player = new EnhancedPlayer("Dimka", 2000, "bazooka");

        System.out.println("Initial health is: " + player.getHealth());

    }
}
