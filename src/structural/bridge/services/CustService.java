package structural.bridge.services;

import structural.bridge.message_senders.MessageSenderBase;

public class CustService implements ICustService{
    public MessageSenderBase messageSenderBase;



    @Override
    public void verify() {
        messageSenderBase.send();
    }
}