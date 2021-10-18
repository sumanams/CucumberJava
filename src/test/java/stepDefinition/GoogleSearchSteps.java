//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearchSteps {
//	
//	WebDriver driver= null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step: browser is open ");
//		System.setProperty("webdriver.chrome.driver","C:/Users/suman/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
//		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\suman\\Documents\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step: user is on google search page ");
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters a text in text box")
//	public void user_enters_a_text_in_text_box() {
//		System.out.println("Inside Step: user enters a text in text box ");
//		driver.findElement(By.name("q")).sendKeys("Sumana Rohith");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside Step: hits enter ");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step: user is navigated to search results ");
//	}
//
//}
