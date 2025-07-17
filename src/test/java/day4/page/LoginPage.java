package day4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement username;

	// WebElement usern = driver.findElement(By.id("user-name"));

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginButton;

	public void usernameTextField(String usernameField) {
		username.sendKeys(usernameField);
	}

	public void passwordTextField(String passwordField) {
		password.sendKeys(passwordField);
	}

	public void LoginButton() {
		loginButton.click();
	}

}
