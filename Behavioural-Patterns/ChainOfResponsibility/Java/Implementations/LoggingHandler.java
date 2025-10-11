package Implementations;

import java.time.Instant;

import Interfaces.BaseHandler;

public class LoggingHandler extends BaseHandler {

    @Override
    protected boolean processRequest(Request request) {
        System.out.println("LoggingHandler: Logging request at : " + Instant.now());
        return true;
    }
}
