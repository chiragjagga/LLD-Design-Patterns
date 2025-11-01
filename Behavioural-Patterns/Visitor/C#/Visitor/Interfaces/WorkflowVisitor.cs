public interface WorkflowVisitor {
    public void visit(EmailTriggerStep emailTriggerStep);
    public void visit(FilterStep filterStep);
    public void visit(CreateTaskStep createTaskStep);
    public void visit(SlackNotificationStep slackNotificationStep);
}
