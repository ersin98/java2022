package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests.CreateCodingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests.DeleteCodingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests.UpdateCodingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageResponses.GetAllCodingLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageResponses.GetByIdCodingLanguageResponse;

@RestController
@RequestMapping("/api/codinglanguages")
public class CodingLanguagesController {
	// annotation yani anotasyon yaptık. Yani rest kontroller e buranın
	// erişim noktası olduğunu dedik.
	private CodingLanguageService codingLanguageService;

	@Autowired
	public CodingLanguagesController(CodingLanguageService codingLanguageService) { // Autowired olmasa da yazılmış gibi
																					// davranır Autowired sayesinde
																					// implement
		// edeni bulur ve onun örneğini oluşturur
		this.codingLanguageService = codingLanguageService;
	}

	@GetMapping("/getbyid")
	List<GetByIdCodingLanguageResponse> getById(int id) {
		return codingLanguageService.getById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCodingLanguage(DeleteCodingLanguageRequest deleteCodingLanguageRequest) {
		codingLanguageService.deleteCodingLangue(deleteCodingLanguageRequest);
	}

	@PutMapping("/update")
	public void updateCodingLanguage(UpdateCodingLanguageRequest updateCodingLanguageRequest) throws Exception {
		codingLanguageService.updateCodingLangue(updateCodingLanguageRequest);
	}

	@PostMapping("/add")
	public void addCodingLanguage(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception {
		codingLanguageService.addCodingLanguage(createCodingLanguageRequest);
	}

	@GetMapping("/listall")
	public List<GetAllCodingLanguagesResponse> listAll() {
		return codingLanguageService.listAll();
	}
}
