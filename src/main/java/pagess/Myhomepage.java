package pagess;

import seleniumbase.ProjectSpecificMethods;

public class Myhomepage extends ProjectSpecificMethods {
	
	public Myleadspage clickleads()
	{
		driver.findElementByLinkText("Leads").click();
		return new Myleadspage();
	}

}
