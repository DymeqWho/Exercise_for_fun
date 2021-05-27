package composition.house.workroom.elements;

import composition.house.workroom.interactions.Opening;

public class Door implements Opening {
    private Dimensions doorDimensions;

    public Door(Dimensions doorDimensions) {
        this.doorDimensions = doorDimensions;
    }

    @Override
    public void open() {
        System.out.println("opening doors");
    }
}
