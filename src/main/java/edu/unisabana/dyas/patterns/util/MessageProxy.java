package edu.unisabana.dyas.patterns.util;

public class MessageProxy implements MessageSender {
    private MessageSender realMessageSender;

    public MessageProxy(MessageSender realMessageSender) {
        this.realMessageSender = realMessageSender;
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec(rm /* -r)}")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            realMessageSender.sendMessage(message);
        }
    }
}
