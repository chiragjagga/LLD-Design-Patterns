public class WorkflowExecutorVisitor : WorkflowVisitor{
    private readonly Dictionary<String, Object> context = new Dictionary<String, Object>();
    private bool shouldContinue = true;

    public WorkflowExecutorVisitor(String subject){
        context.Add("emailSubject", subject);
    }

    public void visit(EmailTriggerStep emailTriggerStep) {
        Console.WriteLine("EXECUTING: Triggered by high priority email from " + emailTriggerStep.getMailbox());
    }

    public void visit(FilterStep filterStep) {
        if (!shouldContinue) return;
        String subject = (String) context["emailSubject"];

        if (subject != null && subject.Contains("INVOICE")) {
            Console.WriteLine("EXECUTING: Filter condition '" + filterStep.getCondition() + "' MET.");
            shouldContinue = true;
        } else {
            Console.WriteLine("EXECUTING: Filter condition '" + filterStep.getCondition() + "' NOT MET. Stopping workflow.");
            shouldContinue = false;
        }
    }

    public void visit(CreateTaskStep createTaskStep) {
        if (!shouldContinue) return;
        Console.WriteLine("EXECUTING: Creating task in project '" + createTaskStep.getProjectName() + 
                           "' with details: '" + createTaskStep.getTaskDetails() + "'");
    }

    public void visit(SlackNotificationStep slackNotificationStep) {
        if (!shouldContinue) return;
        Console.WriteLine("EXECUTING: Sending Slack notification to channel '" + slackNotificationStep.getChannel() + 
                           "' with message: '" + slackNotificationStep.getMessage() + "'");
    }
}
