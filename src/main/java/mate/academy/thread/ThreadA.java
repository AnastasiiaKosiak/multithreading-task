package mate.academy.thread;

import mate.academy.Counter;
import org.apache.log4j.Logger;

public class ThreadA extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadA.class);
    private static final int LIMIT = 100;
    private Counter counter;

    public ThreadA(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() != LIMIT) {
            counter.increment();
            LOGGER.info(Thread.currentThread().getName() + "=" + counter.getCounter());
            //System.out.println(Thread.currentThread().getName() + " " + counter.getCounter());
        }
    }
}
