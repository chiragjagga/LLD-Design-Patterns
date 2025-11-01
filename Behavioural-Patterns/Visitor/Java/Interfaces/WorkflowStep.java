package Interfaces;

public interface WorkflowStep {
    public void accept(WorkflowVisitor visitor);
}
