package proxy.simple;

public class ImageProxy implements Image {

    private static Image image;

    @Override
    public void process() {
        if(image == null){
            image = new ImageImpl();
        }
        image.process();
    }
}
