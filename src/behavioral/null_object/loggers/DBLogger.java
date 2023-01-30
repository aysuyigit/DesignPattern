package behavioral.null_object.loggers;

public class DBLogger implements ILogger{

    @Override
    public void log() {
        System.out.println("DB ye loglandı");
    }
}
