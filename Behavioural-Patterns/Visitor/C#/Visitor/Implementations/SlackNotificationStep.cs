public class SlackNotificationStep : WorkflowStep {
    private readonly String channel;
    private readonly String message;

    public SlackNotificationStep(String channel, String message) {
        this.channel = channel;
        this.message = message;
    }

    public String getChannel() { return channel; }
    public String getMessage() { return message; }

    public void accept(WorkflowVisitor visitor) {
        visitor.visit(this);
    }
    
}
