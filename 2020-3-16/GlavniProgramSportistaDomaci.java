package itbootcamp.sportistaDomaci16032020;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlavniProgramSportistaDomaci {

	public static void main(String[] args) throws IOException {
		SportistaDomaci s1= new SportistaDomaci("Marko", "Markovic", 1995);
		SportistaDomaci s2= new SportistaDomaci("Pera", "Peric", 1998);
		SportistaDomaci s3= new SportistaDomaci("Ivan", "Ivanovic", 1993);
		
	
		KlubDomaci kd = new KlubDomaci("Mladost", "Beograd", 1999);
		
		kd.punjenjeNizaSportista(s1);
		kd.punjenjeNizaSportista(s2);
		kd.punjenjeNizaSportista(s3);
		
		kd.ispisiKlub();
		
		kd.setNazivKluba("Radost");
		kd.ispisiKlub();
		
		System.setProperty("webdriver.chrome.driver", "src\\itbootcamp\\selenium\\resource/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://drive.google.com/open?id=1kcG93I8NJ16Xyzj_iYFyJYxCwy0iPbSL");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\\\tmp\\\\screenshot.png\\"));

	}

}
