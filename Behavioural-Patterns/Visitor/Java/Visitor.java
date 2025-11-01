import java.util.ArrayList;
import java.util.List;

import Implementations.CreateTaskStep;
import Implementations.EmailTriggerStep;
import Implementations.FilterStep;
import Implementations.SlackNotificationStep;
import Implementations.WorkflowExecutorVisitor;
import Implementations.WorkflowValidatorVisitor;
import Interfaces.WorkflowStep;
import Interfaces.WorkflowVisitor;

public class Visitor {
    public static void main(String[] args) {
        List<WorkflowStep> workflow = new ArrayList<>();
        
        workflow.add(new EmailTriggerStep("inbox@company.com", "High"));
        workflow.add(new FilterStep("subject contains 'INVOICE'"));
        workflow.add(new CreateTaskStep("Q4 Finances", "Process new invoice."));
        workflow.add(new SlackNotificationStep("#finance-alerts", "New invoice received and task created."));

        // validate workflow with visitor
        WorkflowVisitor validator = new WorkflowValidatorVisitor();
        for (WorkflowStep step : workflow) {
            step.accept(validator);
        }
        System.out.println("\n-------------------------------------\n");

        // execute the workflow
        WorkflowVisitor executorSuccess = new WorkflowExecutorVisitor("URGENT: New INVOICE #12345");
        for (WorkflowStep step : workflow) {
            step.accept(executorSuccess);
        }
        System.out.println("\n-------------------------------------\n");

        // workflow condition not met case
        WorkflowVisitor executorFail = new WorkflowExecutorVisitor("Hello from a prince");
        for (WorkflowStep step : workflow) {
            step.accept(executorFail);
        }
    }
}
