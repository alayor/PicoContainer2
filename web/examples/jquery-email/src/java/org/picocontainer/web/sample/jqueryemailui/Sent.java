package org.picocontainer.web.sample.jqueryemailui;

import java.util.ArrayList;

/**
 */
public class Sent extends Mailbox {

    public Sent() {
        super(makeStartingMessages());
    }

    private static ArrayList<MessageData> makeStartingMessages() {
        // Use this as our "Database" for this demonstration application
        ArrayList<MessageData> messages = new ArrayList<MessageData>();
        messages.add(new MessageData(1, "Gil Bates", "Jeeves Sobs", "Nice OS", "You've made a great OS there Jeeves", false));
        return messages;
    }

    private String userName = "Gil Bates";

    public MessageData send(String to, String subject, String message) {
        return super.addMessage(new MessageData(0, userName, to, subject, message, false));
    }

}
