public class SmartHomeFacade {
    private readonly SmartLight smartLight;
    private readonly AC ac;
    private readonly AlarmSystem alarmSystem;
    private readonly SmartLock smartLock;

    public SmartHomeFacade(SmartLight light, AC ac, SmartLock smartLock, AlarmSystem alarm){
        this.smartLight = light;
        this.ac = ac;
        this.smartLock = smartLock;
        this.alarmSystem = alarm;
    }

    public void activateNightMode() {
        Console.WriteLine("  Activating Night Mode...");
        smartLight.turnOff();
        ac.setTemp(28); // Energy-saving temperature
        smartLock.smartLock();
        alarmSystem.arm();
        Console.WriteLine("  House is in secure, low-power Night Mode");
    }

    public void activateDayMode() {
        Console.WriteLine("  Activating Day Mode...");
        alarmSystem.disarm();
        smartLock.unlock();
        ac.setTemp(24); // Comfortable day temperature
        smartLight.turnOn();
        smartLight.setBrightness(50);
        Console.WriteLine("  House is in active Day Mode.");
    }
}
