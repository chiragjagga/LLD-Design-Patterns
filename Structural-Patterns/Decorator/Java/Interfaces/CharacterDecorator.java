package Interfaces;

import java.util.List;

public abstract class CharacterDecorator implements ICharacter {
    protected ICharacter character;

    public CharacterDecorator(ICharacter character){
        this.character = character;
    }

    @Override
    public String getName() {
        return character.getName();
    }

    @Override
    public int getAttackPower() {
        return character.getAttackPower();
    }

    @Override
    public int getDefense() {
        return character.getDefense();
    }

    @Override
    public String getDescription() {
        return character.getDescription();
    }

    @Override
    public List<String> getAbilities() {
        return character.getAbilities();
    }
}
