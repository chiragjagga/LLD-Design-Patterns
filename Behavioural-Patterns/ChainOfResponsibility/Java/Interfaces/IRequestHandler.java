package Interfaces;

import Implementations.Request;

public interface IRequestHandler {
    public IRequestHandler setNext(IRequestHandler handler);
    public void handle(Request request);
}
