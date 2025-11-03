package Fragile;

public class Counter {
    /**
     * this class should increament the counter and have a print method
     * that will be overridden by the sub class LoggerCounter
     */
    private int counter = 0;

    public void increament() {
        this.counter++;
        printCounter(); // newly added line after LoggerCounter already is a subclass
        /**
         * that would break the sub class implementation
         * which should just log a message and the counter of the super class
         * because of tight coupling
         * Open Closed Principle and Dependency inversion FROM SOLID
         * are good solutions
         */
    }

    public void printCounter() {
        System.out.println("Counter: " + this.counter);
    }
}
