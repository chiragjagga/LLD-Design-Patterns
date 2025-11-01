package Implementations;

import Interfaces.WorkflowStep;
import Interfaces.WorkflowVisitor;

public class EmailTriggerStep implements WorkflowStep{

    private final String mailbox;
    private final String priority;

    public EmailTriggerStep(String mailbox, String priority) {
        this.mailbox = mailbox;
        this.priority = priority;
    }

    public String getMailbox() { return mailbox; }
    public String getPriority() { return priority; }

    @Override
    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
    
}