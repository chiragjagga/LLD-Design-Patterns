public class AuthorizationHandler : BaseHandler{

    protected override bool processRequest(Request request) {
        Console.WriteLine("-> AuthorizationHandler: Checking authorization...");

        if ("admin".Equals(request.getHeader("role"))) {
            Console.WriteLine("Authorization successful (User is an admin).");
            return true;
        } else {
            Console.WriteLine("Authorization FAILED. User does not have admin role. Request rejected.");
            return false;
        }
    }
    
}
