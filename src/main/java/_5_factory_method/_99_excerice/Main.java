package _5_factory_method._99_excerice;

public class Main {

    private static ImageReaderFactory imageReaderFactory;


    public static void main(String[] args){
        config();
        load();
    }

    static void config() {
        boolean gifFactory = true;
        if (gifFactory) {
            imageReaderFactory = new GifImageReaderFactory();
        }
    }
        static void load() {
            imageReaderFactory.loadImage();
            System.out.println("Image loaded");
        }
    }

