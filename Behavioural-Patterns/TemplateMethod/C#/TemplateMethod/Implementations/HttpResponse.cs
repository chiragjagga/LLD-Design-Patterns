public class HttpResponse {
    private String? body;
    private int statusCode;

    public void setBody(String body){
        this.body = body;
    }

    public void setStatusCode(int statusCode){
        this.statusCode = statusCode;
    }

    public override String ToString(){
        return "Status: " + statusCode + "\nBody:\n" + body;
    }
}
