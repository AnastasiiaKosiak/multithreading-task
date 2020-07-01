package mate.academy;

import mate.academy.thread.ThreadA;
import mate.academy.thread.ThreadB;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        ThreadA threadA = new ThreadA(counter);
        ThreadB runnable = new ThreadB(counter);
        Thread threadB = new Thread(runnable);
        threadB.start();
        threadA.start();
    }
}
