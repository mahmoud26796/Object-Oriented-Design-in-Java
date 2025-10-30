package Coupling;

public class App {
    public static void main(String[] args) throws Exception {
        Order o1 = new Order(new MailSender());
        o1.PlaceOrder();
    }
}