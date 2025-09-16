package Interfaces;

import java.util.List;

public interface ICharacter {
    String getName();
    int getAttackPower();
    int getDefense();
    String getDescription();
    List<String> getAbilities();
}
