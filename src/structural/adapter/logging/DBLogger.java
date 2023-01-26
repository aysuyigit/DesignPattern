package structural.adapter.logging;

public class DBLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Database'e loglandı.");
    }
}
