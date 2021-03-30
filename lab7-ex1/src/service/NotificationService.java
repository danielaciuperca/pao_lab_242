package service;

import model.*;

public class NotificationService {

    /*
      IO streams
      java.io

      IN
        low level
            InputStream
            FileInputStream
            ByteArrayInputStream

        high level
            InputStreamReader
            BufferedReader
            ObjectInputStream
            DataInputStream

      OUT
        low level
            OutputStream
            FileOutputStream
            ByteArrayOutputStream

        high level
            PrintStream
            PrintWriter
            ObjectOutputStream
            DataOutputStream


     java.nio

        Files
        Path
        Paths
    */

    //TODO write the notifications in a csv file
    public void sendNotification(Notification notification) {
        System.out.println("Notification <" + notification.getMessage() + "> successfully sent to " +
                notification.getReceiver().getEmail());
    }

}
