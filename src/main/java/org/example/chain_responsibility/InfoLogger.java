package org.example.chain_responsibility;

public class InfoLogger extends Logger{
    public InfoLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void log(LoggingLevel level) {
        if(level.equals(LoggingLevel.INFO)){
            System.out.println("[INFO]: request has these fields :{}");
        }else{
            super.log(level);
        }
    }
}
