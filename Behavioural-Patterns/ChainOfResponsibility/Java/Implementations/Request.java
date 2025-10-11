package Implementations;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private final Map<String, String> headers = new HashMap<>();
    private final String body;

    public Request(String body){
        this.body = body;
    }

    public void addHeader(String key, String value){
        this.headers.put(key, value);
    }

    public String getHeader(String key){
        return this.headers.get(key);
    }

    public String getBody(){
        return this.body;
    }

}
