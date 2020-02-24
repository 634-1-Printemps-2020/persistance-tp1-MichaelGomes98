package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int v, int max) {
        super(v);
        this.max = max;
    }

    @Override
    public void add(int step) throws CounterException {
        super.add(step);
        checkMax(step);

        if(getValue()+ step < 0){
            throw new CounterException("Compteur negatif " + max);
        }
        else{
            super.add(step);
        }
    }


    @Override
    public void inc() throws CounterException {
        checkMax(1);
        super.inc();
    }

    //Afin d'éviter la redondance de code
    private void checkMax(int i) throws CounterException {
        if(getValue()+i > max){
            throw new CounterException("Valeur max depassée");
        }
    }

    @Override
    public String toString() {
        return "UpperLimitedPositiveCounter{" +
                "value=" + getValue() +
                "max=" + max +
                '}';
    }
}
