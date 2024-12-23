package org.example.chain_responsibility;

public class Execute {
    public static void main(String args[]){
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(LoggingLevel.DEBUG);
    }
}
