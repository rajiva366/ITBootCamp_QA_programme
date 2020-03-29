package itbootcamp.zadaci;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtvaranjeSajtaItbootcamp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://itbootcamp.rs/");
		
		Point pozicija = driver.manage().window().getPosition();
		System.out.println(pozicija);
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		int titleSize = driver.getTitle().length();
		System.out.println(titleSize);
		
		
		driver.navigate().to("https://itbootcamp.rs/vesti-2/");;
		
		title=driver.getTitle();
		System.out.println(title);
		titleSize = driver.getTitle().length();
		System.out.println(titleSize);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.manage().window().setPosition(pozicija);
		
		driver.close();
		
		
		

	}

}
