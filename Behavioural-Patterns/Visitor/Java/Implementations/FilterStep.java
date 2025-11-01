package Implementations;

import Interfaces.WorkflowStep;
import Interfaces.WorkflowVisitor;

public class FilterStep implements WorkflowStep {
    private final String condition;

    public FilterStep(String condition) {
        this.condition = condition;
    }

    public String getCondition() { return condition; }

    @Override
    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
}
