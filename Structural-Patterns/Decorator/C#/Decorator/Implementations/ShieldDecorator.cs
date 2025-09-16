public class ShieldDecorator : CharacterDecorator {

    public ShieldDecorator(ICharacter character) : base(character) {}
    
    public override int GetDefense(){
        return base.GetDefense() + 20;
    }

    public override String GetDescription(){
        return base.GetDescription() + ", carrying a sturdy shield";
    }

    public override List<String> GetAbilities(){
        List<String> abilities = base.GetAbilities();
        abilities.Add("Block attack");
        return abilities;
    }
}
