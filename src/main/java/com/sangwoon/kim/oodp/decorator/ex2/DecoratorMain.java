package com.sangwoon.kim.oodp.decorator.ex2;

public class DecoratorMain {

    public static void main(String[] args) {
        Text text = new PlainText("Hello, Decorator Pattern!");
        System.out.println("Plain text: " + text.getContent());

        text = new BoldDecorator(text);
        System.out.println("Bold text: " + text.getContent());

        text = new ItalicDecorator(text);
        System.out.println("Bold and Italic text: " + text.getContent());

        text = new UnderlineDecorator(text);
        System.out.println("Bold, Italic and underlined text: " + text.getContent());

        Text anotherExample = new UnderlineDecorator(new ItalicDecorator(new PlainText("Another example")));
        System.out.println("Underline and italic text: " + anotherExample.getContent());

    }

}
