public interface IRequestHandler {
    public IRequestHandler SetNext(IRequestHandler handler);
    public void Handle(Request request);
}
