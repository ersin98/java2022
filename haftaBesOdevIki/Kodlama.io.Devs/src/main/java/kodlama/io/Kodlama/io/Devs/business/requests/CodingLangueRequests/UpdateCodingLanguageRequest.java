package kodlama.io.Kodlama.io.Devs.business.requests.CodingLangueRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCodingLanguageRequest {
	private int id;
	private String name;
}
