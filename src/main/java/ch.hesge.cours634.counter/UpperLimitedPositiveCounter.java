package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    int v;
    int max;

    public UpperLimitedPositiveCounter(int v, int max) {
        this.v = v;
        this.max = max;
    }

    @Override
    public void add(int step) throws CounterException {
        super.add(step);
        if(step < 0 && step - v < 0){
            throw new CounterException("valeur negative");
        }
        else if(v + step > max){
            throw new CounterException("Valeur max depassée");
        }
        else{
            v = v + step;
        }
    }

    @Override
    public void inc() throws CounterException {
        super.inc();
    }

    @Override
    public int getValue() {
        return this.v;
    }
}
