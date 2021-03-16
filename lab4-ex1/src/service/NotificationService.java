package service;

import model.*;

public class NotificationService {

    public void sendNotification(Notification notification) {
        System.out.println("Notification <" + notification.getMessage() + "> successfully sent to " +
                notification.getReceiver().getEmail());
    }

}
