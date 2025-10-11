package Implementations;

import Interfaces.BaseHandler;

public class AuthorizationHandler extends BaseHandler{

    @Override
    protected boolean processRequest(Request request) {
        System.out.println("-> AuthorizationHandler: Checking authorization...");

        if ("admin".equals(request.getHeader("role"))) {
            System.out.println("Authorization successful (User is an admin).");
            return true;
        } else {
            System.out.println("Authorization FAILED. User does not have admin role. Request rejected.");
            return false;
        }
    }
    
}
