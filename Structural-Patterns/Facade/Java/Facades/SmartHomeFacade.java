package Facades;

import SmartHome.AC;
import SmartHome.AlarmSystem;
import SmartHome.SmartLight;
import SmartHome.SmartLock;

public class SmartHomeFacade {
    private final SmartLight smartLight;
    private final AC ac;
    private final AlarmSystem alarmSystem;
    private final SmartLock smartLock;

    public SmartHomeFacade(SmartLight light, AC ac, SmartLock lock, AlarmSystem alarm){
        this.smartLight = light;
        this.ac = ac;
        this.smartLock = lock;
        this.alarmSystem = alarm;
    }

    public void activateNightMode() {
        System.out.println("  Activating Night Mode...");
        smartLight.turnOff();
        ac.setTemp(28); // Energy-saving temperature
        smartLock.lock();
        alarmSystem.arm();
        System.out.println("  House is in secure, low-power Night Mode");
    }

    public void activateDayMode() {
        System.out.println("  Activating Day Mode...");
        alarmSystem.disarm();
        smartLock.unlock();
        ac.setTemp(24); // Comfortable day temperature
        smartLight.turnOn();
        smartLight.setBrightness(50);
        System.out.println("  House is in active Day Mode.");
    }
}
