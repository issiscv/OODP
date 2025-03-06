package com.sangwoon.kim.oodp.command.ex2;

public class CommandMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();

        Command insertTextCommand = new InsertTextCommand(textEditor, "Hello, ", 0);
        invoker.executeCommand(insertTextCommand);

        Command insertHello = new InsertTextCommand(textEditor, "World!", 7);
        invoker.executeCommand(insertHello);

        System.out.println("Current text: " + textEditor.getContent());

        invoker.undo();
        System.out.println("After undo: " + textEditor.getContent());

        invoker.redo();
        System.out.println("After redo: " + textEditor.getContent());

        Command deleteTextCommand = new DeleteTextCommand(textEditor, 0, 7);
        invoker.executeCommand(deleteTextCommand);
        System.out.println("After delete: " + textEditor.getContent());

        invoker.undo();
        System.out.println("Final text: " + textEditor.getContent());


    }

}
