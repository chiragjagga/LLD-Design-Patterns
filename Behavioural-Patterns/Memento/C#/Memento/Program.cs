        Canvas canvas = new Canvas();
        History history = new History();

        // Empty state
        history.save(canvas);
        canvas.printShapes();

        // Adding a rectangle
        canvas.addShape(new Shape("rectangle", "Red", 10, 20));
        history.save(canvas);
        canvas.printShapes();

        // Adding a circle
        canvas.addShape(new Shape("circle", "Blue", 50, 60));
        history.save(canvas);
        canvas.printShapes();

        // Adding a triangle
        canvas.addShape(new Shape("triangle", "Green", 100, 120));
        canvas.printShapes();

        // Undo
        Console.WriteLine(">>> UNDO <<<");
        history.undo(canvas);
        canvas.printShapes();

        // Undo
        Console.WriteLine(">>> UNDO <<<");
        history.undo(canvas);
        canvas.printShapes();

        // Undo
        Console.WriteLine(">>> UNDO <<<");
        history.undo(canvas);
        canvas.printShapes();