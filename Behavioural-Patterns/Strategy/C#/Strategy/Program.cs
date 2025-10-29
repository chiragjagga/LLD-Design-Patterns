        String sampleText = "This is a sample paragraph that will be aligned using different strategies.";

        // left alignment
        TextEditor editor = new TextEditor(new LeftAlignmentStrategy());
        editor.setText(sampleText);
        editor.publish();

        // center alignment
        editor.setAlignmentStrategy(new CenterAlignmentStrategy());
        editor.publish();
        
        // right alignment
        editor.setAlignmentStrategy(new RightAlignmentStrategy());
        editor.publish();