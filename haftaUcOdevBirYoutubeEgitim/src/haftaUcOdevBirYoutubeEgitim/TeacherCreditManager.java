package haftaUcOdevBirYoutubeEgitim;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {// başka interface ler de
																						// olabilirdi
//bir sınıf saece bir sınıfı inherit edebilir
	// poliformizm çok biçimlilik
	public void calculate() {
		System.out.println("Ogretmen kredi hesaplandı");
	}

	public void save() {
		System.out.println("Ogretmen kredi kaydedildi");
	}

}
