public class CenterAlignmentStrategy : AlignmentStrategy {
    public void align(String text) {
        Console.WriteLine("== Center Aligned Text ==");
        Console.WriteLine("   " + text + "   ");
        Console.WriteLine("-------------------------");
    }
    
}
