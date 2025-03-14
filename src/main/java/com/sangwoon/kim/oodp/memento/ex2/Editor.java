package com.sangwoon.kim.oodp.memento.ex2;

public class Editor {
    private final Document document;
    private final DocumentHistory history;

    public Editor() {
        this.document = new Document();
        this.history = new DocumentHistory();
    }

    public void write(String text) {
        history.push(document.save());
        document.write(text);
    }

    public void undo() {
        DocumentMemento memento = history.pop();
        if (memento != null) {
            document.restore(memento);
        }
    }

    public String getContent() {
        return document.getContent();
    }

}
