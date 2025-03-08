package com.sangwoon.kim.oodp.chain_of_responsibility.ex2;

public class NetworkLogger extends Logger {

    public NetworkLogger(LogLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("NetworkLogger: " + message);
    }
}
