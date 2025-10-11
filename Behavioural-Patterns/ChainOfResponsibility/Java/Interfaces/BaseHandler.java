package Interfaces;

import Implementations.Request;

public abstract class BaseHandler implements IRequestHandler {
    protected IRequestHandler next;

    @Override
    public IRequestHandler setNext(IRequestHandler next){
        this.next = next;
        return next;
    }

    @Override
    public final void handle(Request request){
        boolean continueChain = processRequest(request);

        if(continueChain && next != null){
            next.handle(request);
        }
    }

    protected abstract boolean processRequest(Request request);
}
