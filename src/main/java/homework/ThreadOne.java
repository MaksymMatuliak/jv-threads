package homework;

import org.apache.log4j.Logger;

public class ThreadOne extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadOne.class);
    private int counter = 0;

    @Override
    public void run() {
        while (counter < 100) {
            counter++;
            LOGGER.warn(counter + " Thread1");
        }
        LOGGER.warn("First tread finished race!");
    }
}
