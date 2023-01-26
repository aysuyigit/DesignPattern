package structural.facedes.logging;

public class DBLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Database logged.");
    }
}
