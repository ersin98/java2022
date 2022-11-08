package kodlama.io.Kodlama.io.Devs.business.requests.CodingLanguageSubTechnologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCodingLanguageSubTechnologyRequest {
	private String name;
	private int codinglanguage_id;
}
