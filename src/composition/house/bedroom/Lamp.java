package composition.house.bedroom;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRaiting){
        this.style = style;
        this.battery = battery;
        this.globRating = globRaiting;
    }

    public void turnOn(){
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }
}









