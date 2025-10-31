public abstract class BasePageHandler {
    
    public void handleRequest(HttpRequest request, HttpResponse response){
        Console.WriteLine("--- Starting Request Handling ---");

        // 1. Common pre-processing (part of the fixed skeleton)
        parseRequest(request);

        // 2. Authentication Hook (optional step for subclasses)
        if (!authenticate(request)) {
            response.setStatusCode(401); // Unauthorized
            response.setBody("<h1>401 Unauthorized: Please log in.</h1>");
            Console.WriteLine("Authentication failed. Halting process.");
            Console.WriteLine("--- Finished Request Handling ---");
            return;
        }

        // 3. Authorization Hook (optional step for subclasses)
        if (!authorize(request)) {
            response.setStatusCode(403); // Forbidden
            response.setBody("<h1>403 Forbidden: You do not have permission.</h1>");
            Console.WriteLine("Authorization failed. Halting process.");
            Console.WriteLine("--- Finished Request Handling ---");
            return;
        }

        // 4. THE PRIMITIVE OPERATION: The abstract step subclasses MUST implement.
        // This is the core business logic.
        renderPage(request, response);

        // 5. Common post-processing (part of the fixed skeleton)
        logRequest(request);
        Console.WriteLine("--- Finished Request Handling ---");
    }

    private void parseRequest(HttpRequest request) {
        Console.WriteLine("Step 1: Parsing request...");
    }

    // A "Hook" method: Subclasses can override it, but don't have to.
    protected virtual bool authenticate(HttpRequest request) {
        Console.WriteLine("Step 2: Running default authentication (always passes).");
        return true;
    }

    // Another "Hook" method: By default, pages require no special authorization.
    protected virtual bool authorize(HttpRequest request) {
        Console.WriteLine("Step 3: Running default authorization (always passes).");
        return true;
    }

    // An ABSTRACT "Primitive Operation": Subclasses MUST provide an implementation.
    protected abstract void renderPage(HttpRequest request, HttpResponse response);

    private void logRequest(HttpRequest request) {
        Console.WriteLine("Step 5: Logging the request...");
    }
    
}
