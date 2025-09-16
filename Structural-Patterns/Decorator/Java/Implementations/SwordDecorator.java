package Implementations;

import java.util.List;

import Interfaces.CharacterDecorator;
import Interfaces.ICharacter;

public class SwordDecorator extends CharacterDecorator{

    public SwordDecorator(ICharacter character) {
        super(character);
    }

    @Override
    public int getAttackPower(){
        return super.getAttackPower() + 10;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " , weilding a mighty sword";
    }

    @Override
    public List<String> getAbilities(){
        List<String> abilities = super.getAbilities();
        abilities.add("Sword Hit");
        return abilities;
    }
}
