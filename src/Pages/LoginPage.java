package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
    public WebElement getEmailInput() {
    	return this.driver.findElement(By.xpath("//input[@id='email']"));
    }
    public WebElement getPasswordInput() {
    	return this.driver.findElement(By.xpath("//input[@id='password']"));
    }
    public WebElement getSubmitBtn() {
    	return this.driver.findElement(By.tagName("button"));
    }
    
    public void logIn(String email,String password) {
    	this.getEmailInput().sendKeys(email);
    	this.getPasswordInput().sendKeys(password);
        this.getSubmitBtn().click();
    }
}
