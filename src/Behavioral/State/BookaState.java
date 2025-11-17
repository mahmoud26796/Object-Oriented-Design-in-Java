package Behavioral.State;

// concrete state A that will implement the interface
public class BookaState implements LibraryState {
    @Override
    public void handle(LibraryContext context) {
        System.out.println("Done Working With Book A .. next Book is B");
        context.setCurrentBookState(new BookbState());
    }
}
