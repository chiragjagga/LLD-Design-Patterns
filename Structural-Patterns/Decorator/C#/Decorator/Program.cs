// See https://aka.ms/new-console-template for more information
    ICharacter hero = new BaseCharacter("CJ");
    printCharacter(hero);
    
    // stack a sword to base character
    hero = new SwordDecorator(hero);
    printCharacter(hero);

    // add a shield to hero with sword
    hero = new ShieldDecorator(hero);
    printCharacter(hero);

    static void printCharacter(ICharacter character){
        Console.WriteLine("Character: " + character.GetDescription());
        Console.WriteLine("  Attack Power: " + character.GetAttackPower());
        Console.WriteLine("  Defense: " + character.GetDefense());
        Console.WriteLine("  Abilities: " + character.GetAbilities());
    }
