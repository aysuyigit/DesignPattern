package behavioral.chain_of_responsibility.logging;

public abstract class AbstractLogger {

    public AbstractLogger nextLogger;

    public void logMessage(String message){
        log(message);

        if(nextLogger != null){
            nextLogger.logMessage(message);
        }
    }

    abstract void log(String message);
}

