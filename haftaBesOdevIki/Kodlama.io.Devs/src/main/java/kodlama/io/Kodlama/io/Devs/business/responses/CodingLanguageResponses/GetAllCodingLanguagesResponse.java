package kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageResponses;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.responses.CodingLanguageSubTechnologyResponses.GetAllCodingLanguageSubTechnologyResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCodingLanguagesResponse {
	// son kullanıcıya ( insan veya başka sistem) gönderilen bilgiler
	private int id;
	private String name;
	private List<GetAllCodingLanguageSubTechnologyResponse> allCodingLanguageSubTechnogyResponses;
}
