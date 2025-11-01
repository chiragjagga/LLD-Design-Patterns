public class WorkflowValidatorVisitor : WorkflowVisitor {

    public void visit(EmailTriggerStep emailTriggerStep) {
        Console.WriteLine("Validating Email Trigger... ");
        if (emailTriggerStep.getMailbox() == null || emailTriggerStep.getMailbox().Length == 0) {
            Console.WriteLine("ERROR: Mailbox is not configured.");
        } else {
            Console.WriteLine("OK.");
        }
    }

    public void visit(FilterStep filterStep) {
        Console.WriteLine("Validating Filter... ");
        if (filterStep.getCondition() == null || filterStep.getCondition().Length == 0) {
            Console.WriteLine("ERROR: Filter condition is empty.");
        } else {
            Console.WriteLine("OK.");
        }
    }

    public void visit(CreateTaskStep createTaskStep) {
        Console.WriteLine("Validating Create Task Step... ");
        if (createTaskStep.getProjectName() == null || createTaskStep.getProjectName().Length == 0) {
            Console.WriteLine("ERROR: Project name is missing.");
        } else {
            Console.WriteLine("OK.");
        }
    }

    public void visit(SlackNotificationStep slackNotificationStep) {
        Console.WriteLine("Validating Slack Step... ");
        if (slackNotificationStep.getChannel() == null || slackNotificationStep.getChannel().Length == 0) {
            Console.WriteLine("ERROR: Slack channel is not configured.");
        } else {
            Console.WriteLine("OK.");
        }
    }
    
}
