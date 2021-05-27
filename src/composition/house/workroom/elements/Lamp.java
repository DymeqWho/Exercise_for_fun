package composition.house.workroom.elements;

public class Lamp {

    private String lampName;
    private int lampBulbVoltage;
    private float lampSize;


    public Lamp(String lampName, int lampBulbVoltage, float lampSize) {
        this.lampName = lampName;
        this.lampBulbVoltage = lampBulbVoltage;
        this.lampSize = lampSize;
    }

    public void turnLightOn(){
        System.out.println("turning light ON");
    }

    public void turnLightOff(){
        System.out.println("turning light OFF");
    }
}
