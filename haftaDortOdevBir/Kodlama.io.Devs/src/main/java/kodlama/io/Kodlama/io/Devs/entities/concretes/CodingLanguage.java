package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class CodingLanguage {
	private int id;
	private String name;

	public CodingLanguage() {// sağ tık,Source, Generate Constructor.
		// içine item seçmedik
		super();
	}

	public CodingLanguage(int id, String name) {
		// aynı işlemde bu sefer itemleri seçtik
		super();// bir base i yok ondan silsek de silmesek de aynı
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
