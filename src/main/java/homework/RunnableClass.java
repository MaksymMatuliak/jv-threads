package homework;

import org.apache.log4j.Logger;

public class RunnableClass implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(RunnableClass.class);
    private static final int FINISH = 100;
    private Race race;

    public RunnableClass(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (race.getCounter() < FINISH) {
            race.setCounter(race.getCounter() + 1);
            LOGGER.info(race.getCounter() + " Thread2");
        }
        LOGGER.info("Second tread finished race!");
    }
}
