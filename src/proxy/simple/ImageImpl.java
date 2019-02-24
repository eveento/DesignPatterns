package proxy.simple;

import java.util.logging.*;

public class ImageImpl implements Image{

    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Override
    public void process() {
        logger.info("processing completed by "+ ImageImpl.class);
    }
}
