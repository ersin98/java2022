package kodlamaIo.entities;

public class Course {
	private int id;
	private String title;
	private String explanation;
	private int price;

	public Course() {

	}

	public Course(int id, String title, String explanation, int price) {

		this.id = id;
		this.title = title;
		this.explanation = explanation;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
