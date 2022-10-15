package polimorfizmRepeat;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {// bu bir constructor
		// her new lendiğinde ne ile çalışacağını alıyoruz
		// bunu da baseloger diyerek hepsini kapsıyoruz
		this.logger = logger;
	}

	public void add() {
		System.out.println("Musteri bu kisimda varitabanina eklendi");
		// bu ekleme işlemini loglayacağız. kim ne zaman ekledi gibi bilgiler

		// Bu vağımlı bir sistemdir. Değişmesi gerektiğinde zorlar
		// DatabaseLogger logger = new DatabaseLogger();
		// logger.log("Log mesaji, CustomManagerde calisti");

		this.logger.log("Log mesaji");// Burada hangisi olacak diye diretmiyoruz
//burada Base in log u değil gönderilen "Database" in logu çalışıyor
	}
}
