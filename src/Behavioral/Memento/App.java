package Behavioral.Memento;

public class App {
    public static void main(String[] args) {
        TextEditor txteditor = new TextEditor();
        History history = new History();

        txteditor.write("Sara Is Pury");
        history.save(txteditor.save());

        System.out.println(txteditor.getContent());

        txteditor.write(" And Lovely");
        history.save(txteditor.save());

        System.out.println(txteditor.getContent());

        System.out.println(history.undo());
        txteditor.restore(history.undo());
        System.out.println(txteditor.getContent());
    }
}
