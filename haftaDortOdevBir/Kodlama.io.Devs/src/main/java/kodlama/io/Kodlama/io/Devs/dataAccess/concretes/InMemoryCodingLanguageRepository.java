package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.CodingLanguage;

//burası iş yapan kısım
@Repository
public class InMemoryCodingLanguageRepository implements CodingLanguageRepository {// in memory olmasının sebebi
																					// bellekte çalışılacak olması
	// Repository == bu bir DataAccess nesnesidir

	List<CodingLanguage> codingLanguage;// işlemler içerisinde listeye ulaşabilmek için global içerisine tanımladık

	public InMemoryCodingLanguageRepository() {// in memory i malıştıran bu kısmı da çalıştıracak

		codingLanguage = new ArrayList<CodingLanguage>();// boş bir dil listesi al
		// veritabanında çekilmediği için kendimiz dolduruyoruz

		codingLanguage.add(new CodingLanguage(1, "C#"));// listeye bir kod dili ekle, parametreleri şunlar...
		codingLanguage.add(new CodingLanguage(2, "Java"));
		codingLanguage.add(new CodingLanguage(3, "Python"));
	}

	@Override
	public List<CodingLanguage> listAll() {

		return codingLanguage;
	}

	@Override
	public CodingLanguage getById(int id) {

		for (CodingLanguage codingLanguage2 : codingLanguage) {
			if (id == codingLanguage2.getId()) {
				return codingLanguage2;
			}
		}
		return null;

	}

	@Override
	public void deleteCodingLanguege(int id) {
		codingLanguage.remove(id);
	}

	@Override
	public void updateCodingLanguege(CodingLanguage codingLanguage) {
		for (CodingLanguage codingLanguage2 : this.codingLanguage) {// this = in Memory için yukarıda oluşturduğumuz

			if (codingLanguage2.getId() == codingLanguage.getId()) {
				codingLanguage2 = codingLanguage;// değişen özellikleri uygula
			}
		}

	}

	@Override
	public void addCodingLanguege(CodingLanguage codingLanguage) {
		this.codingLanguage.add(codingLanguage);
	}

}
