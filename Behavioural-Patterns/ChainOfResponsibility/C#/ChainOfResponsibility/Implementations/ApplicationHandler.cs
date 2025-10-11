public class ApplicationHandler : BaseHandler {
    protected override bool processRequest(Request request) {
        Console.WriteLine("--> Core Application: Processing request body: '" + request.getBody() + "'");
        return true;
    }
    
}
