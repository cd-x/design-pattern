package org.example.chain_responsibility;

import java.util.Objects;

public abstract class Logger {
    protected Logger nextLogger;
    public void log(LoggingLevel level){
        if(!Objects.isNull(nextLogger)){
            nextLogger.log(level);
        }else{
            System.out.printf("Logging level: %s not supported.", level);
        }
    }
}
