package pl.workshop03.model;

public class Exercises {
	private Integer id;
	private String title;
	private String dexcription;
	
	public Exercises(int id, String title, String dexcription) {
		super();
		this.id = id;
		this.title = title;
		this.dexcription = dexcription;
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

	public String getDexcription() {
		return dexcription;
	}

	public void setDexcription(String dexcription) {
		this.dexcription = dexcription;
	}
	
	
}
