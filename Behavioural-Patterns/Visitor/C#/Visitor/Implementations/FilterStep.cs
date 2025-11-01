public class FilterStep : WorkflowStep {
    private readonly String condition;

    public FilterStep(String condition) {
        this.condition = condition;
    }

    public String getCondition() { return condition; }

    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
}
