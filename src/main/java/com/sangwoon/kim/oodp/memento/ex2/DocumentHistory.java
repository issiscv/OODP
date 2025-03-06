package com.sangwoon.kim.oodp.memento.ex2;

import java.util.Stack;

public class DocumentHistory {

    private final Stack<DocumentMemento> history = new Stack<>();

    public void push(DocumentMemento memento) {
        history.push(memento);
    }

    public DocumentMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }

        return null;
    }

}
