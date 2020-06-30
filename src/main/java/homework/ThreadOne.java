package homework;

import org.apache.log4j.Logger;

public class ThreadOne extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadOne.class);
    private Race race;

    public ThreadOne(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (race.getCounter() < 100) {
            race.setCounter(race.getCounter() + 1);
            LOGGER.warn(race.getCounter() + " Thread1");
        }
        LOGGER.warn("First tread finished race!");
    }
}
