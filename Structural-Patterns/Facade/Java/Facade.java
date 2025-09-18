import Facades.RoutineFacade;
import Facades.SmartHomeFacade;
import PersonalDevices.CoffeeMaker;
import PersonalDevices.MusicPlayer;
import SmartHome.AC;
import SmartHome.AlarmSystem;
import SmartHome.SmartLight;
import SmartHome.SmartLock;

public class Facade {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        AC thermostat = new AC();
        SmartLock lock = new SmartLock();
        AlarmSystem alarm = new AlarmSystem();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        MusicPlayer musicPlayer = new MusicPlayer();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, thermostat, lock, alarm);

        RoutineFacade routineFacade = new RoutineFacade(coffeeMaker, musicPlayer, smartHomeFacade);

        // morning routine
        routineFacade.startMorningRoutine();

        // night routine
        routineFacade.startNightRoutine();
    }
}
