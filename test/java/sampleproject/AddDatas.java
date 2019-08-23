package sampleproject;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddDatas {
	static WebDriver driver;
	@Given("user can launch the browser")
	public void user_can_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\FacebookDetails\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize(); 
	}
	@When("user can enter all the fields")
	public void user_can_enter_all_the_fields() {
driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Anand");
		driver.findElement(By.id("lname")).sendKeys("raj");
		driver.findElement(By.id("email")).sendKeys("anand@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9095634100");
		}
	@When("user can enter all the field")
	public void user_can_enter_all_the_field(DataTable dataTable) {
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
	}
	@When("user enters all the field.")
	public void user_enters_all_the_field(DataTable dataTable) {
		Map<String,String > asMap = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asMap.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(asMap.get("lname"));
		driver.findElement(By.id("email")).sendKeys(asMap.get("email"));
		driver.findElement(By.name("addr")).sendKeys(asMap.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(asMap.get("phno"));
		
	}
	@When("user enters all the fields{string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields(String A, String B, String C, String D, String E) {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(A);
		driver.findElement(By.id("lname")).sendKeys(B);
		driver.findElement(By.id("email")).sendKeys(C);
		driver.findElement(By.name("addr")).sendKeys(D);
		driver.findElement(By.id("telephoneno")).sendKeys(E);
			
	}
	@Then("user can enter the submit button")
	public void user_can_enter_the_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}

}
