package testcase;

import org.testng.annotations.Test;

import pagess.Loginpage;
import seleniumbase.ProjectSpecificMethods;

public class TC001_login extends ProjectSpecificMethods{
	@Test
	public void runlogin()
	{
		new Loginpage().enterusername().enterpassword().loginclick();
	}

}
