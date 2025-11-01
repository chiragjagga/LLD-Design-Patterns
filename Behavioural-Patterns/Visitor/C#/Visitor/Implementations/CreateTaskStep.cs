public class CreateTaskStep : WorkflowStep{
    private readonly String projectName;
    private readonly String taskDetails;

    public CreateTaskStep(String projectName, String taskDetails) {
        this.projectName = projectName;
        this.taskDetails = taskDetails;
    }

    public String getProjectName() { return projectName; }
    public String getTaskDetails() { return taskDetails; }
    
    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
    
}
