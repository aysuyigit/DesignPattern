package behavioral.chain_of_responsibility.patterns;

import behavioral.chain_of_responsibility.logging.AbstractLogger;
import behavioral.chain_of_responsibility.logging.ConsoleLogger;
import behavioral.chain_of_responsibility.logging.DBLogger;
import behavioral.chain_of_responsibility.logging.FileLogger;

public class LoggerChain {
    public static AbstractLogger getChainOfLoggers(){

    AbstractLogger dbLogger = new DBLogger();
    AbstractLogger fileLogger = new FileLogger();
    AbstractLogger consoleLogger = new ConsoleLogger();



     dbLogger.nextLogger = fileLogger;
     fileLogger.nextLogger = consoleLogger;

     return dbLogger;
   }
}
