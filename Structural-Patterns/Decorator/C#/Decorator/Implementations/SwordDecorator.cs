public class SwordDecorator : CharacterDecorator{

    public SwordDecorator(ICharacter character) : base(character) {}

    public override int GetAttackPower(){
        return base.GetAttackPower() + 10;
    }

    public override String GetDescription(){
        return base.GetDescription() + " , weilding a mighty sword";
    }

    public override List<String> GetAbilities(){
        List<String> abilities = base.GetAbilities();
        abilities.Add("Sword Hit");
        return abilities;
    }
}
