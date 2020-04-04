package app;
import dataaccess.DBRepository;
import dataaccess.IRepository;
import domain.NoSessionsApprovedException;
import domain.Session;
import domain.Speaker;
import domain.SpeakerDoesntMeetRequirementsException;
import domain.WebBrowser;

public class Application {
	public static void main(String[] args) {
		IRepository repository = new DBRepository();
		Session session1 = new Session("sessiontitle", "sessiondescription");
		WebBrowser browser = new WebBrowser("Chrome", 3);
		Speaker speaker1 = new Speaker("Frank", "Brown", "fbrown@acme.com", 3, true, "www.brownblog.com", browser, "Acme inc.", 800);
		speaker1.addCertification("Java");
		speaker1.addSession(session1);
		try {
			int result=speaker1.register(repository);
			if (result == 1){
				System.out.println("speaker is registered successfully");
			}
			else{
				System.out.println("speaker could not be registered");
			}
		} catch (NoSessionsApprovedException e) {
			e.printStackTrace();
		} catch (SpeakerDoesntMeetRequirementsException e) {
			e.printStackTrace();
		}

	}
}
