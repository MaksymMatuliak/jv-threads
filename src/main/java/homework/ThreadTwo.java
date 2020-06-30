package homework;

import org.apache.log4j.Logger;

public class ThreadTwo implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(ThreadTwo.class);
    private Race race;

    public ThreadTwo(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (race.getCounter() < 100) {
            race.setCounter(race.getCounter() + 1);
            LOGGER.warn(race.getCounter() + " Thread2");
        }
        LOGGER.warn("Second tread finished race!");
    }
}
