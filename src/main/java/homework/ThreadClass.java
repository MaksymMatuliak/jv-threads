package homework;

import org.apache.log4j.Logger;

public class ThreadClass extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadClass.class);
    private static final int FINISH = 100;
    private Race race;

    public ThreadClass(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        while (race.getCounter() < FINISH) {
            race.setCounter(race.getCounter() + 1);
            LOGGER.info(race.getCounter() + " Thread1");
        }
        LOGGER.info("First tread finished race!");
    }
}
