package behavioral.chain_of_responsibility.logging;

public class DBLogger extends AbstractLogger{
    @Override
    void log(String message) {
        System.out.println("Database'e loglandı.");
    }
}
