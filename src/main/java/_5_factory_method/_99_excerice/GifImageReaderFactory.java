package _5_factory_method._99_excerice;

import _5_factory_method._99_excerice.implementation.GifReader;

import java.io.InputStream;

public class GifImageReaderFactory extends ImageReaderFactory {

    private InputStream in;

    @Override
    public ImageReader imageReader() {
        return new GifReader(in);
    }
}
