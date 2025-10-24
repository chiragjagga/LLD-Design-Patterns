public class Canvas {
    private List<Shape> shapes = new List<Shape>();

    public void addShape(Shape shape){
        shapes.Add(shape);
        Console.WriteLine("Added shape: " + shape);
    }

    public CanvasState createMemento(){
        List<Shape> savedShapes = shapes.Select(shape => new Shape(shape)).ToList();
        return new CanvasState(savedShapes);
    }

    public void restore(CanvasState memento){
        this.shapes = memento.getSavedShapes();
        Console.WriteLine("Canvas has been restored.");
    }

    public void printShapes() {
        if (shapes.Count == 0) {
            Console.WriteLine("Canvas is empty.");
        } else {
            Console.WriteLine("Current Canvas Shapes:");
            shapes.ForEach(Console.WriteLine);
        }
        Console.WriteLine("-------------------------");
    }

    public class CanvasState{
        internal readonly List<Shape> savedShapes;

        internal CanvasState(List<Shape> shapes){
            this.savedShapes = shapes;
        }

        internal List<Shape> getSavedShapes(){
            return this.savedShapes;
        }
    }
}
