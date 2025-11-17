package Behavioral.State;

// in our library example this class represents the worker class 
public class LibraryContext {
    private LibraryState currenState;

    // constructor initalize a default State for our books
    public LibraryContext() {
        currenState = new BookaState();
    }

    public void setCurrentBookState(LibraryState state) {
        this.currenState = state;
    }

    public void getNextBook() {
        currenState.handle(this);
    }
}
