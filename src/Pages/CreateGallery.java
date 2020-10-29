package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGallery extends BasicPage {

	public CreateGallery(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	public WebElement getTitleImput() {
		return this.driver.findElement(By.xpath("//input[@id='title']"));
	}
	
	public WebElement getImageInput() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]"));
	}
	public WebElement getAddImageBtn() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]"));
	}
	
	public WebElement moveFirstImageDown() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/button[3]"));
	}
	public WebElement getSubmitBtn() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/button[1]"));
	}
	
	public void enterTitle(String input) {
		this.getTitleImput().sendKeys(input);
	}
	public void enterImageUrl(String url) {
		this.getImageInput().sendKeys(url);
	}
	public void addImage() {
		this.getAddImageBtn().click();
	}
	
	public List<WebElement> getImageList(){
		return this.driver.findElements(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/form[1]/div[3]/div"));
	}
	public void submit() {
		this.getSubmitBtn().click();
	}
	
}
