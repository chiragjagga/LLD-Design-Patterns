public class EmailTriggerStep : WorkflowStep{

    private readonly String mailbox;
    private readonly String priority;

    public EmailTriggerStep(String mailbox, String priority) {
        this.mailbox = mailbox;
        this.priority = priority;
    }

    public String getMailbox() { return mailbox; }
    public String getPriority() { return priority; }

    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
    
}