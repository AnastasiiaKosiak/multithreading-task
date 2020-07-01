package mate.academy;

public class Counter {
    private int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
