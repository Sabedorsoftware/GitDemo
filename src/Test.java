import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi");
		System.out.println("Helloo");
		
		System.out.println("Hello From Selenium");
		
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String Exp_Title="Welcome";
		String Actual_Title =driver.getTitle();
		
		if(Actual_Title.equals(Exp_Title))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Failed");
			System.out.println("Expected Result :"+Exp_Title);
			System.out.println("Actual Result :"+Actual_Title);
		}
		
		
		driver.close();

	}

}
