import Implementations.BaseCharacter;
import Implementations.ShieldDecorator;
import Implementations.SwordDecorator;
import Interfaces.ICharacter;

public class Decorator {
    public static void main(String[] args) {
        ICharacter hero = new BaseCharacter("CJ");
        printCharacter(hero);

        // stack a sword to base character
        hero = new SwordDecorator(hero);
        printCharacter(hero);

        // add a shield to hero with sword
        hero = new ShieldDecorator(hero);
        printCharacter(hero);
    }

    public static void printCharacter(ICharacter character){
        System.out.println("Character: " + character.getDescription());
        System.out.println("  Attack Power: " + character.getAttackPower());
        System.out.println("  Defense: " + character.getDefense());
        System.out.println("  Abilities: " + character.getAbilities());
    }
}
