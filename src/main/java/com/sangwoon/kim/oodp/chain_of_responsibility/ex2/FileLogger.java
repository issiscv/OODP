package com.sangwoon.kim.oodp.chain_of_responsibility.ex2;

public class FileLogger extends Logger {

    public FileLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
