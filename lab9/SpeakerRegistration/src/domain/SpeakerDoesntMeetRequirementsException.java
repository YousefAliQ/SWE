package domain;
public class SpeakerDoesntMeetRequirementsException extends Exception{
	private String message;

	public SpeakerDoesntMeetRequirementsException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
