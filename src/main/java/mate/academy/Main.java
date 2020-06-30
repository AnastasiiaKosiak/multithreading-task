package mate.academy;

import mate.academy.thread.ThreadA;
import mate.academy.thread.ThreadB;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        ThreadA threadA = new ThreadA(counter);
        Thread threadB = new Thread(new ThreadB(counter));
        threadB.start();
        threadA.start();
    }
}
