package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllGalleries extends BasicPage {

	public AllGalleries(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getSearchInput() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/input[1]"));
	}
	public WebElement getFilterButton() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	}
	public WebElement getLoadMoreButton() {
		return this.driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[2]/div[2]/button[1]"));
	}
	public List<WebElement> getSpecificGalleryNameList() {
		return this.driver.findElements(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[2]/div[1]/div[1]/div/h2/a"));
	}
	public void clickSpecificGalleryName(int i) {
		this.getSpecificGalleryNameList().get(i).click();;
	}
	public void filter(String filter) {
		this.getSearchInput().sendKeys(filter);
		this.getFilterButton().click();
	}
	public void loadMore() {
		this.getLoadMoreButton().click();
	}

}
