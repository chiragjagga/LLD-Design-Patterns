// See https://aka.ms/new-console-template for more information
        SmartLight light = new SmartLight();
        AC thermostat = new AC();
        SmartLock smartLock = new SmartLock();
        AlarmSystem alarm = new AlarmSystem();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        MusicPlayer musicPlayer = new MusicPlayer();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, thermostat, smartLock, alarm);

        RoutineFacade routineFacade = new RoutineFacade(coffeeMaker, musicPlayer, smartHomeFacade);

        // morning routine
        routineFacade.startMorningRoutine();

        // night routine
        routineFacade.startNightRoutine();
