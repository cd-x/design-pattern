package org.example.chain_responsibility;

public class ErrorLogger extends Logger{

    public ErrorLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void log(LoggingLevel level) {
        if(level.equals(LoggingLevel.ERROR)){
            System.out.println("[ERROR]: request has has failed due to CustomException.");
        }else{
            super.log(level);
        }
    }
}
