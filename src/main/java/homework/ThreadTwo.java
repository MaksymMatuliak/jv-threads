package homework;

import org.apache.log4j.Logger;

public class ThreadTwo implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(ThreadTwo.class);
    private int counter = 0;

    @Override
    public void run() {
        while (counter < 100) {
            counter++;
            LOGGER.warn(counter + " Thread2");
        }
        LOGGER.warn("Second tread finished race!");
    }
}
