package composition.house.workroom.elements;

public class Room {
    private Dimensions roomDimensions;
    private Chair chair;
    private Desk desk;
    private Lamp lamp;
    private Sofa sofa;
    private Window window;
    private Door door;

    public Room(Dimensions roomDimensions, Chair chair, Desk desk, Lamp lamp, Sofa sofa, Window window, Door door) {
        this.roomDimensions = roomDimensions;
        this.chair = chair;
        this.desk = desk;
        this.lamp = lamp;
        this.sofa = sofa;
        this.window = window;
        this.door = door;
    }

    public void openDoor(){
        door.open();
    }

    public void openWindow(){
        window.open();
    }

    public void turnLightOn(){
        lamp.turnLightOn();
    }
    public void turnLightOff(){
        lamp.turnLightOff();
    }

    public void sitOnSofa(){
        sofa.sit();
    }

    public void sitOnChair(){
        chair.sit();
    }

    public void workOnDesk(){
        desk.workOnDesk();
    }

}
