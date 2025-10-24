public class History {
    private Stack<Canvas.CanvasState> undoStack = new Stack<Canvas.CanvasState>();
    
    public void save(Canvas canvas){
        undoStack.Push(canvas.createMemento());
        Console.WriteLine("Saved canvas state to history.");
    }

    public void undo(Canvas canvas){
        if(undoStack.Count == 0){
            Console.WriteLine("Nothing to undo.");
            return;
        }
        Canvas.CanvasState memento = undoStack.Pop();
        canvas.restore(memento);
    }
}
