package _5_factory_method._99_excerice;

import _5_factory_method._99_excerice.implementation.JpegReader;

import java.io.InputStream;

public class JpegImageReaderFactory extends ImageReaderFactory {

    private InputStream in;

    @Override
    public ImageReader imageReader() {
        return new JpegReader(in);
    }
}
