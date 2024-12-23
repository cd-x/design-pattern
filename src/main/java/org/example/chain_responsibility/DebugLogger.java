package org.example.chain_responsibility;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    @Override
    public void log(LoggingLevel level) {
        if(level.equals(LoggingLevel.DEBUG)){
            System.out.println("[DEBUG]: request has these fields :{}");
        }else{
            super.log(level);
        }
    }
}
