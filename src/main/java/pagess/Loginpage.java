package pagess;

import seleniumbase.ProjectSpecificMethods;

public class Loginpage extends ProjectSpecificMethods  {
	public Loginpage enterusername()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	
public Loginpage enterpassword()
{
	driver.findElementById("password").sendKeys("crmsfa");
	return this;
}
public Homepage loginclick()
{
	driver.findElementByClassName("decorativeSubmit").click();
	return new Homepage();
}
}
