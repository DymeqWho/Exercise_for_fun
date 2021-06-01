package abstractclasses.abstractanimals;

abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird " + getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Bird is breathing");
    }

    abstract void fly();


}
