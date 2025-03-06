package com.sangwoon.kim.oodp.command.ex2;

public class DeleteTextCommand implements Command {

    private TextEditor editor;
    private String deletedText;
    private int position;

    public DeleteTextCommand(TextEditor editor, int position, int length) {
        this.editor = editor;
        this.position = position;
        this.deletedText = editor.getTextSubString(position, position + length);
    }

    @Override
    public void execute() {
        editor.deleteText(position, deletedText.length());
    }

    @Override
    public void undo() {
        editor.insertText(deletedText, position);
    }
}
