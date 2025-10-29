public class RightAlignmentStrategy : AlignmentStrategy {

    public void align(String text) {
        Console.WriteLine(">> Right Aligned Text >>");
        Console.WriteLine("        " + text);
        Console.WriteLine("------------------------");
    }
    
}
