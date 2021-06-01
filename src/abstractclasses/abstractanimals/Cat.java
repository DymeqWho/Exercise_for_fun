package abstractclasses.abstractanimals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Cat is breathing");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
