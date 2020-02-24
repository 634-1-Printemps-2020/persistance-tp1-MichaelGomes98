package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        testCounter();
        testUpperLimitedPositiveValue();


        UpperLimitedPositiveCounter cpt = new UpperLimitedPositiveCounter(2, 11);
        System.out.println(cpt.getValue());
        cpt.inc();
        System.out.println(cpt.getValue());
        cpt.add(6);
        System.out.println(cpt.getValue());
        cpt.add(5);
        System.out.println(cpt.getValue());
    }

    private static void testUpperLimitedPositiveValue() {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 5);
        try{
            counter.add(10);
            System.out.print("Bug");
        } catch (CounterException e) {
            System.out.println("ok");
        }
    }

    private static void testCounter() throws CounterException {
        Counter counter = new Counter();
        //Test constructeur
        if(counter.getValue()!=0){
            throw new IllegalArgumentException("test contructor failed excepted value 0..");
        }

        counter = new Counter(9);
        if(counter.getValue()!=9){
            throw new IllegalArgumentException("test contructor failed excepted value 9..");
        }

        counter = new Counter();
        //test inc()
        counter.inc();
        if(counter.getValue()!=1){
            throw new IllegalArgumentException("Test inc failed");
        }

        //Test add()
        counter = new Counter();
        counter.add(5);
        if(counter.getValue()!= 5){
            throw new IllegalArgumentException("Test add failed");
        }
    }
}
