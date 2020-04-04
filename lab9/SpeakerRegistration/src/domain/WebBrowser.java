package domain;

public class WebBrowser {
	public BrowserName name ;
	public int majorVersion ;

	public WebBrowser(String name, int majorVersion)
	{
		this.name = TranslateStringToBrowserName(name);
		majorVersion = majorVersion;
	}

	private BrowserName TranslateStringToBrowserName(String name)
	{
		if (name.contains("IE")) return BrowserName.InternetExplorer;
		//TODO: Add more logic for properly sniffing for other browsers.
		return BrowserName.Unknown;
	}

	public enum BrowserName
	{
		Unknown,
		InternetExplorer,
		Firefox,
		Chrome,
		Opera,
		Safari,
		Dolphin,
		Konqueror,
		Linx
	}
}


