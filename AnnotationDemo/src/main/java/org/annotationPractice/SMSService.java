package org.annotationPractice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mybean")
public class SMSService {

    public void sendMessage(String receiver, String message) {
        System.out.println(message + " is sent to: " + receiver + " by text message...");
    }
}
