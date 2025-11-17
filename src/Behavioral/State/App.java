package Behavioral.State;

public class App {
    public static void main(String[] args) {
        // client code
        LibraryContext librarycontext = new LibraryContext();

        for (int i = 0; i < 3; i++) {
            librarycontext.getNextBook();
            System.out.println();
        }
    }
}
