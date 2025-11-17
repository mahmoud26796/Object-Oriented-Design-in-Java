package Behavioral.Memento;

import java.util.Stack;

public class History {
    private Stack<Text> undoStack = new Stack<>();

    public void save(Text txt) {
        undoStack.push(txt);
    }

    public Text undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return new Text("");
    }
}
