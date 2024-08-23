/* Program in Java to implement a notification system that sends standardized 
notifications to users through various channels */

//---------------------------------CB-1------------------------------
// Implementing Different Notification Channel
//-------------------------------------------------------------------
// Define the EventNotifier interface for the notification system
interface EventNotifier {
    void notify(String message);
}

// Create a class that implements the EventNotifier interface for push
// notifications
class PushNotifier implements EventNotifier {
    @Override
    public void notify(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

// Create a class that implements the EventNotifier interface for email
// notifications
class EmailNotifier implements EventNotifier {
    @Override
    public void notify(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

// Create a class that implements the EventNotifier interface for SMS
// notifications
class SMSNotifier implements EventNotifier {
    @Override
    public void notify(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

// -----------------------------------CB-2-------------------------
// Implementing Notification system
// ----------------------------------------------------------------

// Create a class representing a notification system
class NotificationSystem {
    private EventNotifier notifier; // a notification channel
    private String message; // Message to be sent

    NotificationSystem() {
        message = "Message Received";
    }

    // Set a notification channel as the notifier
    public void setNotifier(EventNotifier notifier) {
        this.notifier = notifier;
    }

    // Simulate sending a notification through notifier
    public void sendNotification() {
        if (notifier != null) {
            notifier.notify(message);
        }
    }
}

// ---------------------------------------CB-3------------------------------
// Implementing main method
// --------------------------------------------------------------------------
public class NotificationApp {
    public static void main(String[] args) {

        // Create a notification system
        NotificationSystem notificationSystem = new NotificationSystem();

        // Create notifier instances for push message, email and SMS
        EventNotifier pushNotifier = new PushNotifier();
        EventNotifier emailNotifier = new EmailNotifier();
        EventNotifier smsNotifier = new SMSNotifier();

        // Set the notifiers for the push notification system
        notificationSystem.setNotifier(pushNotifier);
        // Simulate sending push notifications
        notificationSystem.sendNotification();

        // Set the notifiers for the email notification system
        notificationSystem.setNotifier(emailNotifier);
        // Simulate sending email notifications
        notificationSystem.sendNotification();

        // Set the notifiers for the sms notification system
        notificationSystem.setNotifier(smsNotifier);
        // Simulate sending sms notifications
        notificationSystem.sendNotification();
    }
}
// --------------------------------------------------------------------------