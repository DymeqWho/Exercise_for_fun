package abstractclasses.abstractanimals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Czika");

        dog.breath();
        cat.breath();
        cat.eat();
        dog.eat();

        Bird parrot = new Bird("Parrot") {
            @Override
            void fly() {
                System.out.println(getName() + " can fly");
            }
        };
        Bird penguin = new Bird("penguin") {
            @Override
            void fly() {
                System.out.println(getName() + " can't fly!");
            }
        };

        parrot.eat();
        parrot.breath();
        parrot.fly();

        penguin.eat();
        penguin.breath();
        penguin.fly();
    }
}
