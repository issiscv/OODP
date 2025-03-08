package com.sangwoon.kim.oodp.chain_of_responsibility.ex2;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        Logger logger = new NetworkLogger(LogLevel.WARN);
        Logger fileLogger = new FileLogger(LogLevel.DEBUG);
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);

        logger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        logger.logMessage(LogLevel.INFO, "This is an information");
        logger.logMessage(LogLevel.DEBUG, "This is a debug level information.");
        logger.logMessage(LogLevel.WARN, "This is a warning information.");
    }

}
