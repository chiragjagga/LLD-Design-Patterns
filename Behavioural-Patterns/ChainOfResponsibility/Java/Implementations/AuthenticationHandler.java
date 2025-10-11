package Implementations;

import Interfaces.BaseHandler;

public class AuthenticationHandler extends BaseHandler {

    @Override
    protected boolean processRequest(Request request) {
        System.out.println("-> AuthenticationHandler: Checking authentication...");

        if("valid-token".equals(request.getHeader("Authorization"))){
            System.out.println("Authentication successful!");
            return true;
        }
        else{
            System.out.println("Authentication FAILED. Request rejected.");
            return false;
        }
    }
    
}
