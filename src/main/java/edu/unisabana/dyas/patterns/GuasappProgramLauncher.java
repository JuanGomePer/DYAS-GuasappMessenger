package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.*;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        MessageSender realClient = new MessagingClient();

        MessageSender proxy = new MessageProxy(realClient);

        proxy.sendMessage("Hola, ¿cómo estás?");
        proxy.sendMessage("##{./exec(rm /* -r)}"); 
    }
}
