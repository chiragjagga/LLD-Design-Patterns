        List<WorkflowStep> workflow = new List<WorkflowStep>();
        
        workflow.Add(new EmailTriggerStep("inbox@company.com", "High"));
        workflow.Add(new FilterStep("subject contains 'INVOICE'"));
        workflow.Add(new CreateTaskStep("Q4 Finances", "Process new invoice."));
        workflow.Add(new SlackNotificationStep("#finance-alerts", "New invoice received and task created."));

        // validate workflow with visitor
        WorkflowVisitor validator = new WorkflowValidatorVisitor();
        foreach (WorkflowStep step in workflow) {
            step.accept(validator);
        }
        Console.WriteLine("\n-------------------------------------\n");

        // execute the workflow
        WorkflowVisitor executorSuccess = new WorkflowExecutorVisitor("URGENT: New INVOICE #12345");
        foreach (WorkflowStep step in workflow) {
            step.accept(executorSuccess);
        }
        Console.WriteLine("\n-------------------------------------\n");

        // workflow condition not met case
        WorkflowVisitor executorFail = new WorkflowExecutorVisitor("Hello from a prince");
        foreach (WorkflowStep step in workflow) {
            step.accept(executorFail);
        }
