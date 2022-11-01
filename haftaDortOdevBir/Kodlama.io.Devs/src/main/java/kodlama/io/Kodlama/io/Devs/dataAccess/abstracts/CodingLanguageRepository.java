package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;//farklı yerden import ettirme

import kodlama.io.Kodlama.io.Devs.entities.concretes.CodingLanguage;

public interface CodingLanguageRepository {
	// kod işlemleri
	List<CodingLanguage> listAll();// CodingLanguage[] olursa sonradan değiştirmesi eklemesi çıkarması uğraştırır

	CodingLanguage getById(int id);

	void deleteCodingLanguege(int id);

	void updateCodingLanguege(CodingLanguage codingLanguage);

	void addCodingLanguege(CodingLanguage codingLanguage);
}
