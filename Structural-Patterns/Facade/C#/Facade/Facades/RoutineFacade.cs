public class RoutineFacade {
    private readonly CoffeeMaker coffeeMaker;
    private readonly MusicPlayer musicPlayer;
    private readonly SmartHomeFacade smartHomeFacade;

    public RoutineFacade(CoffeeMaker coffeeMaker, MusicPlayer musicPlayer, SmartHomeFacade smartHomeFacade){
        this.coffeeMaker = coffeeMaker;
        this.musicPlayer = musicPlayer;
        this.smartHomeFacade = smartHomeFacade;
    }

    public void startMorningRoutine() {
        Console.WriteLine("--- Good Morning! ---");
        
        // Use subsystem for smart home settings
        Console.WriteLine("Using smartHomeFacade to activate day mode...");
        this.smartHomeFacade.activateDayMode();

        // Access personal devices
        coffeeMaker.brew();
        musicPlayer.playPlaylist("Peaceful Morning");
        Console.WriteLine("--- Morning routine complete.");
    }

    public void startNightRoutine() {
        Console.WriteLine("--- Good Night! ---");
        
        // Access personal devices
        Console.WriteLine("Winding down personal devices...");
        musicPlayer.stop();

        // Use subsystem for smart home settings
        Console.WriteLine("Using smartHomeFacade to activate night mode...");
        this.smartHomeFacade.activateNightMode();
        
        Console.WriteLine("--- Night routine complete. Sleep well! ---\n");
    }
}
