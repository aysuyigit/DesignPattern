package structural.adapter.adapters;

import structural.adapter.EEMail;
import structural.adapter.logging.ILogger;

public class MailAdapter implements ILogger {

    @Override
    public void log() {
        EEMail eemail = new EEMail();
        eemail.sendMail();
    }
}
