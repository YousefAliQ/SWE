package domain;
import java.util.ArrayList;
import java.util.List;

import dataaccess.IRepository;

/// Represents a single speaker
public class Speaker {
	public String firstName;
	public String lastName;
	public String email;
	public int exp;
	public boolean hasBlog;
	public String blogURL;
	public WebBrowser browser;
	public List<String> certifications = new ArrayList<String>();
	public String employer;
	public int registrationFee;
	public List<Session> sessions= new ArrayList<Session>();
	
	

	public Speaker(String firstName, String lastName, String email, int exp,
			boolean hasBlog, String blogURL, WebBrowser browser,
			String employer, int registrationFee) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.exp = exp;
		this.hasBlog = hasBlog;
		this.blogURL = blogURL;
		this.browser = browser;
		this.employer = employer;
		this.registrationFee = registrationFee;
	}



	// Register a speaker
	//returns the speakerID
	public int register(IRepository repository) throws NoSessionsApprovedException, SpeakerDoesntMeetRequirementsException{
		//lets init some vars
		int speakerId = 0;
		boolean good = false;
		boolean appr = false;
		//List<String> nt = new ArrayList<String>(); 
		//nt.add("MVC4");
		//nt.add("Node.js");
		//nt.add("CouchDB");
		//nt.add("Angular");
		List<String> ot = new ArrayList<String>(); 
		ot.add("Cobol");
		ot.add("Punch Cards");
		ot.add("Commodore");
		ot.add("VBScript");
		
		//DEFECT #5274 DA 12/10/2012
		//We weren't filtering out the prodigy domain so I added it.
		List<String> domains = new ArrayList<String>();
		domains.add("hotmail.com");
		domains.add("prodigy.com");
		domains.add("CompuServe.com");

		if (!(firstName == null))
		{
			if (!(lastName == null))
			{


				if (!(email == null))
				{
					//put list of employers in array
					List<String> emps = new ArrayList<String>();
					emps.add("Microsoft");
					emps.add("Google");
					emps.add("Fog Creek Software");
					emps.add("37Signals");

					//DFCT #838 Jimmy 
					//We're now requiring 3 certifications so I changed the hard coded number. Boy, programming is hard.
					good = ((exp > 10 || hasBlog || certifications.size() > 3 || emps.contains(employer)));



					if (!good)
					{
						//need to get just the domain from the email
						String emailDomain = (email.split("@"))[1];

						if (!domains.contains(emailDomain) && (!(browser.name == WebBrowser.BrowserName.InternetExplorer && browser.majorVersion < 9)))
						{
							good = true;
						}
					}

					if (good)
					{
						//DEFECT #5013 CO 1/12/2012
						//We weren't requiring at least one session
						if (sessions.size() != 0)
						{
							for (Session session : sessions)
							{
								//for (String tech : nt)
								//{
								//    if (session.title.contains(tech))
								//    {
								//        session.approved = true;
								//        break;
								//    }
								//}

								for (String tech : ot)
								{
									if (session.title.contains(tech) || session.description.contains(tech))
									{
										session.approved = false;
										break;
									}
									else
									{
										session.approved = true;
										appr = true;
									}
								}
							}
						}
						else
						{
							throw new IllegalArgumentException("Can't register speaker with no sessions to present.");
						}

						if (appr)
						{






							//if we got this far, the speaker is approved
							//let's go ahead and register him/her now.
							//First, let's calculate the registration fee. 
							//More experienced speakers pay a lower fee.
							if (exp <= 1)
							{
								registrationFee = 500;
							}
							else if (exp >= 2 && exp <= 3)
							{
								registrationFee = 250;
							}
							else if (exp >= 4 && exp <= 5)
							{
								registrationFee = 100;
							}
							else if (exp >= 6 && exp <= 9)
							{
								registrationFee = 50;
							}
							else
							{
								registrationFee = 0;
							}



							//Now, save the speaker and sessions to the db.
							try
							{
								speakerId = repository.saveSpeaker(this);
							}
							catch (Exception e)
							{
								//in case the db call fails 
							}
						}
						else
						{
							throw new NoSessionsApprovedException("No sessions approved.");
						}
					}
					else
					{
						throw new SpeakerDoesntMeetRequirementsException("Speaker doesn't meet our abitrary and capricious standards.");
					}

				}
				else
				{
					throw new IllegalArgumentException("Email is required.");
				}
			}
			else
			{
				throw new IllegalArgumentException("Last name is required.");
			}
		}
		else
		{
			throw new IllegalArgumentException("First Name is required");
		}

		//if we got this far, the speaker is registered.
		return speakerId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
	}



	public boolean isHasBlog() {
		return hasBlog;
	}



	public void setHasBlog(boolean hasBlog) {
		this.hasBlog = hasBlog;
	}



	public String getBlogURL() {
		return blogURL;
	}



	public void setBlogURL(String blogURL) {
		this.blogURL = blogURL;
	}



	public WebBrowser getBrowser() {
		return browser;
	}



	public void setBrowser(WebBrowser browser) {
		this.browser = browser;
	}



	public List<String> getCertifications() {
		return certifications;
	}



	public void addCertification(String certification) {
		certifications.add(certification);
	}



	public String getEmployer() {
		return employer;
	}



	public void setEmployer(String employer) {
		this.employer = employer;
	}



	public int getRegistrationFee() {
		return registrationFee;
	}



	public void setRegistrationFee(int registrationFee) {
		this.registrationFee = registrationFee;
	}



	public List<Session> getSessions() {
		return sessions;
	}



	public void addSession(Session session) {
		sessions.add(session);
	}


}



