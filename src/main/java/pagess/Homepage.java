package pagess;

import seleniumbase.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods{
	
	public Myhomepage clickcrmfsa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new Myhomepage();
	}

	public Loginpage clicklogout()
	{

		driver.findElementByClassName("decorativeSubmit").click();
		return new Loginpage();
	}
}
