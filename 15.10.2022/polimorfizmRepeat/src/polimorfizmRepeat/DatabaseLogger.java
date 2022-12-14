package polimorfizmRepeat;

public class DatabaseLogger extends BaseLogger {

	// şu ksıım olmasa da BaseLogger dan çalışır.
	// ancak burada yazarak overrride yani üzerine yazma işlemi yapmış oluyoruz
	public void log(String message) {
		System.out.println("Logged to database :" + message);
	}

	// hepsinde aynı kod çalışırken databese de farklı bir işlem yapacaksak onun
	// için kullanılabilir
}
