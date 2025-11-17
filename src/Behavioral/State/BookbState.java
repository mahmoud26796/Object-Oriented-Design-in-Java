package Behavioral.State;

// concrete state A that will implement the interface
public class BookbState implements LibraryState {
    @Override
    public void handle(LibraryContext context) {
        System.out.println("Done Working With Book B .. next Book is C");
        context.setCurrentBookState(new BookcState());
    }
}
