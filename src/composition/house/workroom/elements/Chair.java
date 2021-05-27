package composition.house.workroom.elements;

import composition.house.workroom.interactions.Sitting;

public class Chair implements Sitting {
    private String name;

    public Chair(String name) {
        this.name = name;
    }

    @Override
    public void sit() {
        System.out.println("sitting on chair " + name);
    }

}
