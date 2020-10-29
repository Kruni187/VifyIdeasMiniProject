package Tests;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AllGalleries;
import Pages.CreateGallery;
import Pages.LoginPage;

public class AllGalleriesTest extends BasicTest {

	@Test (priority=0)
	
	public void filterTest() throws InterruptedException, IOException {
		AllGalleries ag = new AllGalleries(driver, wait);
		LoginPage lp = new LoginPage(driver, wait);
		
		this.driver.navigate().to(this.baseUrl+"login");
		lp.logIn(this.email, this.password);
		
		Thread.sleep(3000);
		ag.filter("prvi");
		Thread.sleep(2000);
		Assert.assertTrue(ag.getSpecificGalleryNameList().size()==9);
		
		}
	@Test (priority=5)
	
	public void createGalleryTest() throws InterruptedException {
		CreateGallery cg = new CreateGallery(driver, wait);
		AllGalleries ag = new AllGalleries(driver, wait);
		
		this.driver.navigate().to(this.baseUrl+"create");
		cg.enterTitle("Andrija Krunic");
		Thread.sleep(1000);
		cg.enterImageUrl("https://png.pngtree.com/png-clipart/20190516/original/pngtree-cartoon-explosive-color-wow-font-png-image_4197909.jpg");
		cg.addImage();
		cg.addImage();
		Thread.sleep(1500);
		Assert.assertTrue(cg.getImageList().size()==3);
		cg.submit();
		this.driver.navigate().to(this.baseUrl);
		ag.filter("Andrija");
		Assert.assertTrue(ag.getSpecificGalleryNameList().size()>0,"[ERROR] Neuspesno kriranje galerije");
	}
}
