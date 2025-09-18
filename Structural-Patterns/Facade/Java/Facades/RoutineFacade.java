package Facades;

import PersonalDevices.CoffeeMaker;
import PersonalDevices.MusicPlayer;

public class RoutineFacade {
    private final CoffeeMaker coffeeMaker;
    private final MusicPlayer musicPlayer;
    private final SmartHomeFacade smartHomeFacade;

    public RoutineFacade(CoffeeMaker coffeeMaker, MusicPlayer musicPlayer, SmartHomeFacade smartHomeFacade){
        this.coffeeMaker = coffeeMaker;
        this.musicPlayer = musicPlayer;
        this.smartHomeFacade = smartHomeFacade;
    }

    public void startMorningRoutine() {
        System.out.println("--- Good Morning! ---");
        
        // Use subsystem for smart home settings
        System.out.println("Using smartHomeFacade to activate day mode...");
        this.smartHomeFacade.activateDayMode();

        // Access personal devices
        coffeeMaker.brew();
        musicPlayer.playPlaylist("Peaceful Morning");
        System.out.println("--- Morning routine complete.");
    }

    public void startNightRoutine() {
        System.out.println("--- Good Night! ---");
        
        // Access personal devices
        System.out.println("Winding down personal devices...");
        musicPlayer.stop();

        // Use subsystem for smart home settings
        System.out.println("Using smartHomeFacade to activate night mode...");
        this.smartHomeFacade.activateNightMode();
        
        System.out.println("--- Night routine complete. Sleep well! ---\n");
    }
}
