package Implementations;

import Interfaces.WorkflowStep;
import Interfaces.WorkflowVisitor;

public class CreateTaskStep implements WorkflowStep{
    private final String projectName;
    private final String taskDetails;

    public CreateTaskStep(String projectName, String taskDetails) {
        this.projectName = projectName;
        this.taskDetails = taskDetails;
    }

    public String getProjectName() { return projectName; }
    public String getTaskDetails() { return taskDetails; }
    
    @Override
    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
    
}
