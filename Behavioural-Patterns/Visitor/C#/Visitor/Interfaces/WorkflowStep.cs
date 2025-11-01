public interface WorkflowStep {
    public void accept(WorkflowVisitor visitor);
}
