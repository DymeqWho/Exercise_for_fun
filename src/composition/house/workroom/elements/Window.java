package composition.house.workroom.elements;

import composition.house.workroom.interactions.Opening;

public class Window implements Opening {
    private Dimensions windowDimensions;

    public Window(Dimensions windowDimensions) {
        this.windowDimensions = windowDimensions;
    }

    @Override
    public void open() {
        System.out.println("opening window");
    }
}
