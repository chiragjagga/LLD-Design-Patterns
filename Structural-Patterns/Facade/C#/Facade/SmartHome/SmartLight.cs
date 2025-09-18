public class SmartLight {
    public void turnOff(){
        Console.WriteLine("Lights are off!");
    }

    public void turnOn(){
        Console.WriteLine("Lights are on!");
    }

    public void setBrightness(int level){
        Console.WriteLine("Light brightness set to level" + level + "%");
    }
}
