package day4.tests;

import day4.base.*;
import day4.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Start extends BaseTest {

	@Test
	void testScript1() throws Throwable {
		LoginPage obj = new LoginPage(driver);
		obj.usernameTextField("standard_user");
		obj.passwordTextField("secret_sauce");
		obj.LoginButton();
		Thread.sleep(5000);
		String expectedUrl = "https://www.saucedemo.com/v1/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedUrl, "Login failed!");

	}

	@Test
	void testScript2() throws Throwable {
		LoginPage obj = new LoginPage(driver);
		obj.usernameTextField("standard_use");
		obj.passwordTextField("secret_sauce");
		obj.LoginButton();
		Thread.sleep(5000);
		String expectedUrl = "https://www.saucedemo.com/v1/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedUrl, "Login failed!");

	}

	@Test
	void testScript3() throws Throwable {
		LoginPage obj = new LoginPage(driver);
		obj.usernameTextField("standard_use");
		obj.passwordTextField("secret_saue");
		obj.LoginButton();
		Thread.sleep(5000);
		String expectedUrl = "https://www.saucedemo.com/v1/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedUrl, "Login failed!");

	}

}