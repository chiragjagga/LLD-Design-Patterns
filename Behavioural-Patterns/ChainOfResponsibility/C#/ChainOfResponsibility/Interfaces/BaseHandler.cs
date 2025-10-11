public abstract class BaseHandler : IRequestHandler {
    protected IRequestHandler? next;

    public IRequestHandler SetNext(IRequestHandler next){
        this.next = next;
        return next;
    }

    public void Handle(Request request){
        bool continueChain = processRequest(request);

        if(continueChain && next != null){
            next.Handle(request);
        }
    }

    protected abstract bool processRequest(Request request);
}
