package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        UpperLimitedPositiveCounter cpt = new UpperLimitedPositiveCounter(2, 11);
        System.out.println(cpt.getValue());
        cpt.inc();
        System.out.println(cpt.getValue());
        cpt.add(6);
        System.out.println(cpt.getValue());
        cpt.add(5);
        System.out.println(cpt.getValue());
    }
}
