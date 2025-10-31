public class HttpRequest {
    private readonly Dictionary<String, String> headers = new Dictionary<String, String>();

    public void addHeader(String key, String value){
        headers.Add(key, value);
    }

    public Dictionary<String, String> getHeaders(){
        return headers;
    }
}
