package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CodingLanguageSubTechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.CreateCodingLanguageSubTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.DeleteCodingLanguageSubTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.UpdateCodingLanguageSubTechnologRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetAllCodingLanguageSubTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetByIdCodingLanguageSubTechnogyResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CodingLanguageSubTechnologyRespository;
import kodlama.io.Kodlama.io.Devs.entities.CodingLanguage;
import kodlama.io.Kodlama.io.Devs.entities.CodingLanguageSubTechnology;

@Service
public class CodingLanguageSubTechnologManager implements CodingLanguageSubTechnologyService {
//en sade hali için hiç kural koymadım
	private CodingLanguageSubTechnologyRespository codingLanguageSubTechnologyRespository;
	private CodingLanguageRepository codingLanguageRepository;

	@Autowired
	public CodingLanguageSubTechnologManager(
			CodingLanguageSubTechnologyRespository codingLanguageSubTechnologyRespository,
			CodingLanguageRepository codingLanguageRepository) {
		super();
		this.codingLanguageSubTechnologyRespository = codingLanguageSubTechnologyRespository;
		this.codingLanguageRepository = codingLanguageRepository;
	}

	@Override
	public void updateCodingLanguageSubTechnology(
			UpdateCodingLanguageSubTechnologRequest updateCodingLanguageSubTechnologRequest) {
		List<CodingLanguageSubTechnology> codingLanguageSubTechnologies = codingLanguageSubTechnologyRespository
				.findAll();
		Optional<CodingLanguageSubTechnology> codingLanguageSubTechnologyRepository = codingLanguageSubTechnologyRespository
				.findById(updateCodingLanguageSubTechnologRequest.getId());

		for (CodingLanguageSubTechnology codingLanguageSubTechnology : codingLanguageSubTechnologies) {
			if (updateCodingLanguageSubTechnologRequest.getId() == codingLanguageSubTechnology.getId()) {
				CodingLanguageSubTechnology codingLanguageSubTechnologyupdate = codingLanguageSubTechnologyRepository
						.get();
				codingLanguageSubTechnologyupdate.setName(updateCodingLanguageSubTechnologRequest.getName());
				codingLanguageSubTechnologyRespository.save(codingLanguageSubTechnologyupdate);
			}

		}
	}

	@Override
	public void createCodingLanguageSubTechnology(
			CreateCodingLanguageSubTechnologyRequest createcodingLanguageSubTechnologyRequest) {
		CodingLanguageSubTechnology codingLanguageSubTechnology = new CodingLanguageSubTechnology();

		codingLanguageSubTechnology.setName(createcodingLanguageSubTechnologyRequest.getName());

		List<CodingLanguage> codingLanguages = codingLanguageRepository.findAll();

		CodingLanguage codingLanguage = new CodingLanguage();

		for (CodingLanguage whichCodingLanguage : codingLanguages) {
			if (whichCodingLanguage.getId() == createcodingLanguageSubTechnologyRequest.getCodinglanguage_id()) {

				codingLanguage.setId(whichCodingLanguage.getId());// veya
																	// createcodingLanguageSubTechnologyRequest.getCodinglanguage_id()
				codingLanguage.setName(whichCodingLanguage.getName());

			}

		}

		codingLanguageSubTechnology.setCodinglanguage(codingLanguage);
		codingLanguageSubTechnologyRespository.save(codingLanguageSubTechnology);

	}

	@Override
	public void deleteCodingLanguageSubTechnology(
			DeleteCodingLanguageSubTechnologyRequest deleteCodingLanguageSubTechnologyRequest) {
		CodingLanguageSubTechnology codingLanguageSubTechnology = new CodingLanguageSubTechnology();
		Optional<CodingLanguageSubTechnology> deletecodingLanguageSubTechnology = codingLanguageSubTechnologyRespository
				.findById(deleteCodingLanguageSubTechnologyRequest.getId());
		codingLanguageSubTechnology = deletecodingLanguageSubTechnology.get();
		codingLanguageSubTechnologyRespository.delete(codingLanguageSubTechnology);
	}

	@Override
	public List<GetAllCodingLanguageSubTechnologyResponse> getall() {
		List<GetAllCodingLanguageSubTechnologyResponse> allCodingLanguageSubTechnogyResponses = new ArrayList<>();
		List<CodingLanguageSubTechnology> codingLanguageSubTechnologies = codingLanguageSubTechnologyRespository
				.findAll();
		for (CodingLanguageSubTechnology codingLanguageSubTechnology : codingLanguageSubTechnologies) {
			GetAllCodingLanguageSubTechnologyResponse getallcodingLanguageSubTechnology = new GetAllCodingLanguageSubTechnologyResponse();
			getallcodingLanguageSubTechnology.setId(codingLanguageSubTechnology.getId());
			getallcodingLanguageSubTechnology.setName(codingLanguageSubTechnology.getName());
			getallcodingLanguageSubTechnology
					.setCodinglanguage_id(codingLanguageSubTechnology.getCodinglanguage().getId());
			allCodingLanguageSubTechnogyResponses.add(getallcodingLanguageSubTechnology);
		}
		return allCodingLanguageSubTechnogyResponses;
	}

	@Override
	public GetByIdCodingLanguageSubTechnogyResponse getById(int id) {
		Optional<CodingLanguageSubTechnology> getcodingLanguageSubTechnology = codingLanguageSubTechnologyRespository
				.findById(id);
		CodingLanguageSubTechnology codingLanguageSubTechnology = getcodingLanguageSubTechnology.get();
		GetByIdCodingLanguageSubTechnogyResponse byIdCodingLanguageSubTechnogyResponse = new GetByIdCodingLanguageSubTechnogyResponse();
		byIdCodingLanguageSubTechnogyResponse.setId(codingLanguageSubTechnology.getId());
		byIdCodingLanguageSubTechnogyResponse.setName(codingLanguageSubTechnology.getName());

		return byIdCodingLanguageSubTechnogyResponse;
	}

}