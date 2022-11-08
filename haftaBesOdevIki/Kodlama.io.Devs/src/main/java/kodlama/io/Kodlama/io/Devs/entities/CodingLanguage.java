package kodlama.io.Kodlama.io.Devs.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data = @Getter + @Setter+ @NoArgsConstructor
//@AllArgsConstructor ekleyince data nın @NoArgsConstructor özelliği
//eziliyor o yüzden Constructor u parametresiz kullanmak için ayrıca
//@NoArgsConstructor yazmak gerekiyor
//@Entity= veritabanı varlığı olduğunu gösterir
@Entity
@Table(name = "codinglanguage")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CodingLanguage {
	// her entity için eğer üzrinde bir işlem yapılacaksa repository gerekiyor
	// GenerationType.IDENTITY= Id otomatik artsın demiş olduk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codinglanguage_id")
	private int id;
	@Column(name = "codinglanguage_name")
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy = "codinglanguage") // , fetch = FetchType.LAZY, cascade = CascadeType.ALL
	private List<CodingLanguageSubTechnology> codingLanguageSubTechnologies;

}