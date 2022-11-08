package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests.CreateCodingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests.DeleteCodingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests.UpdateCodingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageResponses.GetAllCodingLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageResponses.GetByIdCodingLanguageResponse;

public interface CodingLanguageService {
//servisten itibaren veritabanı nesnesi kullanmıyoruz.
	void addCodingLanguage(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception;

	void updateCodingLangue(UpdateCodingLanguageRequest updateCodingLanguageRequest) throws Exception;

	void deleteCodingLangue(DeleteCodingLanguageRequest deleteCodingLangueRequest);

	List<GetAllCodingLanguagesResponse> listAll();

	List<GetByIdCodingLanguageResponse> getById(int id);

}