package domain;
public class NoSessionsApprovedException extends Exception {
	private String message;

	public NoSessionsApprovedException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
