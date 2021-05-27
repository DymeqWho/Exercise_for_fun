package composition.house.workroom.elements;

public class Desk {
    private String name;
    private Dimensions dimensions;

    public Desk(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
    }

    protected void workOnDesk(){
        System.out.println("working on desk");
    }

}
