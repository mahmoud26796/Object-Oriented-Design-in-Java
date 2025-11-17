package Behavioral.State;

// concrete state A that will implement the interface
public class BookcState implements LibraryState {
    @Override
    public void handle(LibraryContext context) {
        System.out.println("Done Working With All Books .. Congrats!");
    }
}
