package Coupling;
public class MailSender implements Notifiable {
    // public void sendMail(String msg) {
    // // System.out.println("Sending Email: " + msg);
    // }

    @Override
    public void SendNotification(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}