package proxy.simple;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy();
        image.process();

    }
}
