package Implementations;

public class HttpResponse {
    private String body;
    private int statusCode;

    public void setBody(String body){
        this.body = body;
    }

    public void setStatusCode(int statusCode){
        this.statusCode = statusCode;
    }

    @Override
    public String toString(){
        return "Status: " + statusCode + "\nBody:\n" + body;
    }
}
