package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CodingLanguageSubTechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.CreateCodingLanguageSubTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.DeleteCodingLanguageSubTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests.UpdateCodingLanguageSubTechnologRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetAllCodingLanguageSubTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetByIdCodingLanguageSubTechnogyResponse;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/codinglanguagesubtechnology")
public class CodingLanguageSubTechnologyController {
	private CodingLanguageSubTechnologyService codingLanguageSubTechnologyService;

	@GetMapping("/getbyid")
	GetByIdCodingLanguageSubTechnogyResponse getbyId(int id) {
		return codingLanguageSubTechnologyService.getById(id);
	}

	@DeleteMapping("/delete")
	public void deleteCodingLanguageSubTechnology(
			DeleteCodingLanguageSubTechnologyRequest deleteCodingLanguageSubTechnologyRequest) {
		codingLanguageSubTechnologyService.deleteCodingLanguageSubTechnology(deleteCodingLanguageSubTechnologyRequest);
	}

	@PostMapping("/create")
	public void createCodingLanguageSubTechnology(
			CreateCodingLanguageSubTechnologyRequest createCodingLanguageSubTechnologyRequest) {
		codingLanguageSubTechnologyService.createCodingLanguageSubTechnology(createCodingLanguageSubTechnologyRequest);
	}

	@PutMapping("/update")
	public void updateCodingLanguageSubTechnology(
			UpdateCodingLanguageSubTechnologRequest updateCodingLanguageSubTechnologRequest) {
		codingLanguageSubTechnologyService.updateCodingLanguageSubTechnology(updateCodingLanguageSubTechnologRequest);
	}

	@GetMapping("/getall")
	public List<GetAllCodingLanguageSubTechnologyResponse> getall() {
		return codingLanguageSubTechnologyService.getall();

	}
}
