package Implementations;

public class Shape {
    private final String shapeType;
    private final String color;
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

    @Override
    public String toString(){
        return String.format("%s[color=%s, x=%d, y=%d]", shapeType, color, x, y);
    }
}
