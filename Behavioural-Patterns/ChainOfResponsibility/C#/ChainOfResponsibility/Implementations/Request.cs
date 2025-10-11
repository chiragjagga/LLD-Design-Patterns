public class Request {
    private readonly IDictionary<String, String> headers = new Dictionary<String, String>();
    private readonly String body;

    public Request(String body){
        this.body = body;
    }

    public void addHeader(String key, String value){
        this.headers.Add(key, value);
    }

    public String getHeader(String key){
        return this.headers[key];
    }

    public String getBody(){
        return this.body;
    }

}
