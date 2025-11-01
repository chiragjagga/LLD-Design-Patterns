package Implementations;

import Interfaces.WorkflowStep;
import Interfaces.WorkflowVisitor;

public class SlackNotificationStep implements WorkflowStep {
    private final String channel;
    private final String message;

    public SlackNotificationStep(String channel, String message) {
        this.channel = channel;
        this.message = message;
    }

    public String getChannel() { return channel; }
    public String getMessage() { return message; }

    @Override
    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
    
}
