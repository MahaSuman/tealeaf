package seleniumbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
//public String excelFileName;

		public static ChromeDriver driver;
		//@Parameters({"url","uname","password"})
		@BeforeMethod
		public void login1() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			driver.findElementById("username").sendKeys(username);
//			driver.findElementById("password").sendKeys(pass);
//			driver.findElementByClassName("decorativeSubmit").click();
//			driver.findElementByLinkText("CRM/SFA").click();
//			

			
		}
		@DataProvider
//		public String[][] sendData() throws IOException {
//		ReadExcel excel=new ReadExcel();
//		String[][] data=excel.Readexcels(excelFileName);
//		return data;
//		}

		@AfterMethod
		public void close()
		{
		driver.close();
		}
			// TODO Auto-generated constructor stub
		

	}



