package abstractclasses.abstractanimals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Dog is breathing");
    }
}
