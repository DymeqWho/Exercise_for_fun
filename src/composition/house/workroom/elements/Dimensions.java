package composition.house.workroom.elements;

public class Dimensions {
    private float height;
    private float width;
    private float depth;

    public Dimensions(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }
}
