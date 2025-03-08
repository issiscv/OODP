package com.sangwoon.kim.oodp.chain_of_responsibility.ex2;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);
    }
}
