package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    int v;

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
}
