package Behavioral.Memento;

public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public Text save() {
        return new Text(content.toString());
    }

    public void restore(Text txt) {
        content = new StringBuilder(txt.getText());
    }
}
