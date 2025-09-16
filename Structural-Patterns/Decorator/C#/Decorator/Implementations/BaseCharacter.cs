public class BaseCharacter : ICharacter{
    private String name;

    public BaseCharacter(String name){
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public int GetAttackPower() {
        return 10;
    }

    public int GetDefense() {
        return 5;
    }

    public String GetDescription() {
        return name;
    }

    public List<String> GetAbilities() {
        List<String> abilities = ["Punch"];
        return abilities;
    }
    
}
