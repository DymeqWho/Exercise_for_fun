package composition.house.workroom.elements;

import composition.house.workroom.interactions.Sitting;

public class Sofa implements Sitting {
    private String sofaName;
    private Dimensions dimensions;

    public Sofa(String sofaName, Dimensions dimensions) {
        this.sofaName = sofaName;
        this.dimensions = dimensions;
    }

    @Override
    public void sit() {
        System.out.println("sitting on sofa " + sofaName);
    }
}
