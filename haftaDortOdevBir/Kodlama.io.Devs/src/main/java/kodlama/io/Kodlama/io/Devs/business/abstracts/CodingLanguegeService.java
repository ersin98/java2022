package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.CodingLanguage;

public interface CodingLanguegeService {

	void addCodingLanguage(CodingLanguage codingLanguage) throws Exception;// İsimler tekrar edemez. ve programlama dili
																			// boş geçilemez

	void updateCodingLangue(CodingLanguage codingLanguege) throws Exception;

	void deleteCodingLangue(int id);

	List<CodingLanguage> listAll();

	CodingLanguage getById(int id);
}