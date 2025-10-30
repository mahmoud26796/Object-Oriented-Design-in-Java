package Coupling;

public class Order {
	Notifiable notifiable;

	public Order(Notifiable notifiable) {
		this.notifiable = notifiable;
	}

	public void PlaceOrder() {
		// MailSender email = new MailSender();
		// email.sendMail("Order Placed Successfully");
		notifiable.SendNotification("Order Placed Successfully");
	}

}