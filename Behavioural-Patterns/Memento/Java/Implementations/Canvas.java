package Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Canvas {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
        System.out.println("Added shape: " + shape);
    }

    public CanvasState createMemento(){
        List<Shape> savedShapes = shapes.stream().map(Shape::new).collect(Collectors.toList());
        return new CanvasState(savedShapes);
    }

    public void restore(CanvasState memento){
        this.shapes = memento.getSavedShapes();
        System.out.println("Canvas has been restored.");
    }

    public void printShapes() {
        if (shapes.isEmpty()) {
            System.out.println("Canvas is empty.");
        } else {
            System.out.println("Current Canvas Shapes:");
            shapes.forEach(System.out::println);
        }
        System.out.println("-------------------------");
    }

    public static class CanvasState{
        private final List<Shape> savedShapes;

        private CanvasState(List<Shape> shapes){
            this.savedShapes = shapes;
        }

        private List<Shape> getSavedShapes(){
            return this.savedShapes;
        }
    }
}
