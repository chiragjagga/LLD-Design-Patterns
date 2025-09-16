package Implementations;

import java.util.List;

import Interfaces.CharacterDecorator;
import Interfaces.ICharacter;

public class ShieldDecorator extends CharacterDecorator {

    public ShieldDecorator(ICharacter character) {
        super(character);
    }
    
    @Override
    public int getDefense(){
        return super.getDefense() + 20;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", carrying a sturdy shield";
    }

    @Override
    public List<String> getAbilities(){
        List<String> abilities = super.getAbilities();
        abilities.add("Block attack");
        return abilities;
    }
}
