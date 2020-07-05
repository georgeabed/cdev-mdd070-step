package _5_factory_method._99_excerice;

public abstract class ImageReaderFactory {

    public void loadImage(){
        ImageReader imageReaderOk = imageReader();
        imageReaderOk.loadImage();
    }


    public abstract ImageReader imageReader();
}
