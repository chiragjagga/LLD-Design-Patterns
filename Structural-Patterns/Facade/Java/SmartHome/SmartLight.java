package SmartHome;

public class SmartLight {
    public void turnOff(){
        System.out.println("Lights are off!");
    }

    public void turnOn(){
        System.out.println("Lights are on!");
    }

    public void setBrightness(int level){
        System.out.println("Light brightness set to level" + level + "%");
    }
}
