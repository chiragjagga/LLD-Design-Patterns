public class Shape {
    private readonly String shapeType;
    private readonly String color;
    private int x, y;

    public Shape(String shapeType, String color, int x, int y){
        this.shapeType = shapeType;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Shape(Shape other){
        this.shapeType = other.shapeType;
        this.color = other.color;
        this.x = other.x;
        this.y = other.y;
    }

    public override String ToString(){
        return $"{shapeType}[color={color}, x={x}, y={y}]";
    }
}
