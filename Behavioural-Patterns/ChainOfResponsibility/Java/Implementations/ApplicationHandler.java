package Implementations;

import Interfaces.BaseHandler;

public class ApplicationHandler extends BaseHandler {

    @Override
    protected boolean processRequest(Request request) {
        System.out.println("--> Core Application: Processing request body: '" + request.getBody() + "'");
        return true;
    }
    
}
