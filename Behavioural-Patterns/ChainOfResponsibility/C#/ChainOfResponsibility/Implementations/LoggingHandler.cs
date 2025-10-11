public class LoggingHandler : BaseHandler {

    protected override bool processRequest(Request request) {
        Console.WriteLine("LoggingHandler: Logging request at : " + DateTime.Now);
        return true;
    }
}
