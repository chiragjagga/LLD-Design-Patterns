package Implementations;

import java.util.HashMap;
import java.util.Map;

import Interfaces.WorkflowVisitor;

public class WorkflowExecutorVisitor implements WorkflowVisitor{
    private final Map<String, Object> context = new HashMap<>();
    private boolean shouldContinue = true;

    public WorkflowExecutorVisitor(String subject){
        context.put("emailSubject", subject);
    }

    @Override
    public void visit(EmailTriggerStep emailTriggerStep) {
        System.out.println("EXECUTING: Triggered by high priority email from " + emailTriggerStep.getMailbox());
    }

    @Override
    public void visit(FilterStep filterStep) {
        if (!shouldContinue) return;
        String subject = (String) context.get("emailSubject");

        if (subject != null && subject.contains("INVOICE")) {
            System.out.println("EXECUTING: Filter condition '" + filterStep.getCondition() + "' MET.");
            shouldContinue = true;
        } else {
            System.out.println("EXECUTING: Filter condition '" + filterStep.getCondition() + "' NOT MET. Stopping workflow.");
            shouldContinue = false;
        }
    }

    @Override
    public void visit(CreateTaskStep createTaskStep) {
        if (!shouldContinue) return;
        System.out.println("EXECUTING: Creating task in project '" + createTaskStep.getProjectName() + 
                           "' with details: '" + createTaskStep.getTaskDetails() + "'");
    }

    @Override
    public void visit(SlackNotificationStep slackNotificationStep) {
        if (!shouldContinue) return;
        System.out.println("EXECUTING: Sending Slack notification to channel '" + slackNotificationStep.getChannel() + 
                           "' with message: '" + slackNotificationStep.getMessage() + "'");
    }
}
