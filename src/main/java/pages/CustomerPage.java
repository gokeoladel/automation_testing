package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	WebDriver driver;

	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By enterEmail = By.xpath("//div[@class = 'form-group']/input");
	By enterPassword = By.xpath("//div[@class = 'form-group mb-2']/input");

//	By loginButton = By.xpath("//*[text()='Login']/../span[1]");
	By loginButton = By.xpath("//div[@class='btn-box pt-3 pb-4']/button");

	public void enterEmail(String email) {
		driver.findElement(enterEmail).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(enterPassword).sendKeys(password);
	}

	public void loginButton() {
		driver.findElement(loginButton).click();
	}

}
