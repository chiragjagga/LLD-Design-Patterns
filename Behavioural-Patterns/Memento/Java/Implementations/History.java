package Implementations;

import java.util.Stack;

import Implementations.Canvas.CanvasState;

public class History {
    private Stack<CanvasState> undoStack = new Stack<>();
    
    public void save(Canvas canvas){
        undoStack.add(canvas.createMemento());
        System.out.println("Saved canvas state to history.");
    }

    public void undo(Canvas canvas){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo.");
            return;
        }
        CanvasState memento = undoStack.pop();
        canvas.restore(memento);
    }
}
