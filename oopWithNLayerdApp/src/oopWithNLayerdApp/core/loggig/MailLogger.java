package oopWithNLayerdApp.core.loggig;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gönerildi: " + data);
	}

}
