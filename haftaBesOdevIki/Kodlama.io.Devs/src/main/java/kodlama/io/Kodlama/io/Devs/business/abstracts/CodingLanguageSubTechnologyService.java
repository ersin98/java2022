package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.CreateCodingLanguageSubTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.DeleteCodingLanguageSubTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.UpdateCodingLanguageSubTechnologRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetAllCodingLanguageSubTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetByIdCodingLanguageSubTechnogyResponse;

public interface CodingLanguageSubTechnologyService {
	void updateCodingLanguageSubTechnology(
			UpdateCodingLanguageSubTechnologRequest updateCodingLanguageSubTechnologRequest);

	void createCodingLanguageSubTechnology(
			CreateCodingLanguageSubTechnologyRequest createcodingLanguageSubTechnologyRequest);

	void deleteCodingLanguageSubTechnology(
			DeleteCodingLanguageSubTechnologyRequest deleteCodingLanguageSubTechnologyRequest);

	List<GetAllCodingLanguageSubTechnologyResponse> getall();

	GetByIdCodingLanguageSubTechnogyResponse getById(int id);
}
