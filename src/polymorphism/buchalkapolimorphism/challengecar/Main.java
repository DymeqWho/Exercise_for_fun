package polymorphism.buchalkapolimorphism.challengecar;

public class Main {
    public static void main(String[] args) {
        Car fiatPunto = new FiatPunto();
        Car nissanNavara = new NissanNavara();
        Car toyotaYaris = new ToyotaYaris();

        System.out.println(fiatPunto.closeDoors());
        System.out.println(fiatPunto.starEngine());
        System.out.println(nissanNavara.closeDoors());
        System.out.println(nissanNavara.starEngine());
        System.out.println(toyotaYaris.closeDoors());
        System.out.println(toyotaYaris.starEngine());

        System.out.println(fiatPunto.accelerate());
        System.out.println(nissanNavara.accelerate());
        System.out.println(toyotaYaris.accelerate());

        System.out.println(fiatPunto.fuel());
        System.out.println(nissanNavara.fuel());
        System.out.println(toyotaYaris.fuel());
    }
}
