package messageProviderExampleOne;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = new StandartOutMessageRenderer();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
