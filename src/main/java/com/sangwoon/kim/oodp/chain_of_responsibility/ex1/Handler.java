package com.sangwoon.kim.oodp.chain_of_responsibility.ex1;

public abstract class Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(int number) {
        process(number);
        if (next != null) next.handle(number);
    }

    protected abstract void process(int number);

}
