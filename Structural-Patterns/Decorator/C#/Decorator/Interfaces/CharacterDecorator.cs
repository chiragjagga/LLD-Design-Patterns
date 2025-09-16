public abstract class CharacterDecorator : ICharacter {
    protected ICharacter character;

    public CharacterDecorator(ICharacter character){
        this.character = character;
    }

    public virtual String GetName() {
        return character.GetName();
    }

    public virtual int GetAttackPower() {
        return character.GetAttackPower();
    }

    public virtual int GetDefense() {
        return character.GetDefense();
    }

    public virtual String GetDescription() {
        return character.GetDescription();
    }

    public virtual List<String> GetAbilities() {
        return character.GetAbilities();
    }
}
