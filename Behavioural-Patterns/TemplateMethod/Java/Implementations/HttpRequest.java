package Implementations;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final Map<String, String> headers = new HashMap<>();

    public void addHeader(String key, String value){
        headers.put(key, value);
    }

    public Map<String, String> getHeaders(){
        return headers;
    }
}
