package Implementations;

import java.util.ArrayList;
import java.util.List;

import Interfaces.ICharacter;

public class BaseCharacter implements ICharacter{
    private String name;

    public BaseCharacter(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public int getDefense() {
        return 5;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public List<String> getAbilities() {
        List<String> abilities = new ArrayList<>();
        abilities.add("Punch");
        return abilities;
    }
    
}
