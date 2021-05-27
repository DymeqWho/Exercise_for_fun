package composition.house;

import composition.house.bedroom.Bed;
import composition.house.bedroom.Bedroom;
import composition.house.bedroom.Ceiling;
import composition.house.bedroom.Wall;
import composition.house.workroom.elements.*;

public class Main {
    public static void main(String[] args) {
        Dimensions roomDimensions = new Dimensions(3.5f, 5.0f, 5.0f);
        Window roomWindow = new Window(new Dimensions(1.5f, 2.0f, 0.05f));
        Desk roomDesk = new Desk("Kalkuun", new Dimensions(0.8f, 1.6f, 0.6f));
        Chair roomChair = new Chair("Rumpa");
        Lamp roomLamp = new Lamp("Ljuss", 10, 0.6f);
        Sofa roomSofa = new Sofa("Gratiss", new Dimensions(0.7f, 2.0f, 0.6f));
        Door roomDoor = new Door(new Dimensions(2.1f, 0.7f, 0.05f));
        Room room = new Room(roomDimensions, roomChair, roomDesk, roomLamp, roomSofa, roomWindow, roomDoor);

        room.openDoor();
        room.openWindow();
        room.turnLightOn();
        room.sitOnChair();
        room.workOnDesk();
        room.sitOnSofa();
        room.turnLightOff();

        System.out.println();
        System.out.println();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        composition.house.bedroom.Lamp lamp = new composition.house.bedroom.Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();


    }
}
