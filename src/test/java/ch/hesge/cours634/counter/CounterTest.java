package ch.hesge.cours634.counter;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CounterTest {

    @org.junit.Test
    public void inc() throws CounterException {
        Counter counter = new Counter();
        counter.inc();
        Assert.assertEquals(1, counter.getValue());

    }

    @org.junit.Test
    public void add() throws CounterException {
        Counter counter = new Counter();
        counter.add(5);
        Assert.assertEquals(5, counter.getValue());

    }

    @org.junit.Test
    public void getValue() {
    }
}