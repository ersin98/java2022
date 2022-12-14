package polimorfizmRepeat;

public class Main {
	// polimorfizm çok biçimlilik demektir
	// loglama
	public static void main(String[] args) {
		/*
		 * EmailLogger emailLogger= new EmailLogger();
		 * 
		 * emailLogger.log("Log Mesaji");
		 */

		// ekleme ve çıkarma işlemmleri kolay. bu polimorfizm yani çok biçimlilik
		// sayesinde
		// BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		// EmailLogger(), new DatabaseLogger(),
		// new ConsoleLogger() };
		// Bir int dizisinde yazı ekleyemezsin. Yani diziler başta belirtilen türde
		// eleman alırlar
		// Burada diğer logger ları BaseLogger dizisine alınabilme sebebi onların aynı
		// zamanda BaseLogger olması
		// for (BaseLogger logger : loggers) {// FileLogger BaseLogger i tutamaz ama
		// BaseLogger hepsini tutar
		// logger.log(" Log mesajii");
		// }

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}
}
