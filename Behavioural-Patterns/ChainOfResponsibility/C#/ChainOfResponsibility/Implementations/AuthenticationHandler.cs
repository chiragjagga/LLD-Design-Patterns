public class AuthenticationHandler : BaseHandler {

    protected override bool processRequest(Request request) {
        Console.WriteLine("-> AuthenticationHandler: Checking authentication...");

        if("valid-token".Equals(request.getHeader("Authorization"))){
            Console.WriteLine("Authentication successful!");
            return true;
        }
        else{
            Console.WriteLine("Authentication FAILED. Request rejected.");
            return false;
        }
    }
    
}
