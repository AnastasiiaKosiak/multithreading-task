package mate.academy.thread;

import mate.academy.Counter;
import org.apache.log4j.Logger;

public class ThreadB implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(ThreadA.class);
    private static final int LIMIT = 100;
    private Counter counter;

    public ThreadB(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCounter() != LIMIT) {
            counter.increment();
            LOGGER.info(Thread.currentThread().getName() + "=" + counter.getCounter());
        }
    }
}
