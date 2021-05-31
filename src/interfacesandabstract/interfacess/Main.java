package interfacesandabstract.interfacess;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        ISaveable monster = new Monster("Werewolf", 20, 40);

        System.out.println(player);
        System.out.println("Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}");
        System.out.println(monster);
        System.out.println("Monster{name='Werewolf', hitPoints=20, strength=40}");
    }
}
