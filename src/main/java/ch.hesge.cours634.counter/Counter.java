package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int v;

    public Counter() {
    }

    public Counter(int v) {
        this.v = v;
    }

    @java.lang.Override
    public void inc() throws CounterException {
        v = v + 1;
    }

    @java.lang.Override
    public void add(int step) throws CounterException {
            v = v + step;
    }

    @java.lang.Override
    public int getValue() {
        return v;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "v=" + v +
                '}';
    }

}
