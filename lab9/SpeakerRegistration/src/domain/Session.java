package domain;
// Represents a single conference session
public class Session {

	public String title;
	public String description;
	public boolean approved;

	public Session(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
}
