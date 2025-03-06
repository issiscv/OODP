package com.sangwoon.kim.oodp.memento.ex2;

public class Document {

    private StringBuilder content;

    public Document() {
        this.content = new StringBuilder();
    }

    public String getContent() {
        return content.toString();
    }

    public void write(String text) {
        content.append(text);
    }

    public DocumentMemento save() {
        return new DocumentMemento(content.toString());
    }

    public void restore(DocumentMemento memento) {
        this.content = new StringBuilder(memento.getContent());;
    }

}
