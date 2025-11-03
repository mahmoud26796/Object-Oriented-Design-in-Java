package Fragile;

public class LoggerCounter extends Counter {
    /**
     * here i this code there is a tight couple between super and sub classes
     * which will introduce the fragile base class problem
     * if we changed the super class that's may be harmful for the subclass
     * implementation
     */
    @Override
    public void printCounter() {
        System.out.println("Logging Counter...");
        super.printCounter();
    }   
}
