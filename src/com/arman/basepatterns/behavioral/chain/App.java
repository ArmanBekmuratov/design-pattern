package com.arman.basepatterns.behavioral.chain;

public class App {
    public static void main(String[] args) {
        AbstractLogger getChain = Util.getChainOfLogger();

        getChain.logMessage(AbstractLogger.INFO, "This is an information");
        getChain.logMessage(AbstractLogger.BUG, "This is an information about bugs");
        getChain.logMessage(AbstractLogger.ERROR, "This is an error");
    }
}
