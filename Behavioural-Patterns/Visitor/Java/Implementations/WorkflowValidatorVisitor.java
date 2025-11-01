package Implementations;

import Interfaces.WorkflowVisitor;

public class WorkflowValidatorVisitor implements WorkflowVisitor {

    @Override
    public void visit(EmailTriggerStep emailTriggerStep) {
        System.out.print("Validating Email Trigger... ");
        if (emailTriggerStep.getMailbox() == null || emailTriggerStep.getMailbox().isEmpty()) {
            System.out.println("ERROR: Mailbox is not configured.");
        } else {
            System.out.println("OK.");
        }
    }

    @Override
    public void visit(FilterStep filterStep) {
        System.out.print("Validating Filter... ");
        if (filterStep.getCondition() == null || filterStep.getCondition().isEmpty()) {
            System.out.println("ERROR: Filter condition is empty.");
        } else {
            System.out.println("OK.");
        }
    }

    @Override
    public void visit(CreateTaskStep createTaskStep) {
        System.out.print("Validating Create Task Step... ");
        if (createTaskStep.getProjectName() == null || createTaskStep.getProjectName().isEmpty()) {
            System.out.println("ERROR: Project name is missing.");
        } else {
            System.out.println("OK.");
        }
    }

    @Override
    public void visit(SlackNotificationStep slackNotificationStep) {
        System.out.print("Validating Slack Step... ");
        if (slackNotificationStep.getChannel() == null || slackNotificationStep.getChannel().isEmpty()) {
            System.out.println("ERROR: Slack channel is not configured.");
        } else {
            System.out.println("OK.");
        }
    }
    
}
