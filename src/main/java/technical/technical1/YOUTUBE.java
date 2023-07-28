package technical.technical1;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class YOUTUBE extends Testbase{

	
	
	
	@FindBy(xpath="//body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[4]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement search;
	
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]")
	private WebElement searchbut;
	
	
	
	@FindBy(xpath="yt-icon")
	private WebElement logo;
	
	
	
	
	
	public YOUTUBE() {
		
		PageFactory.initElements(driver,this);
		
		
		
		
	}
	
	public void verifysearch() {
		search.click();
		search.sendKeys("new songs");}
	
	public void verifysearchbut() {
		
		driver.navigate().back();
	}
	
	
	
	public void verifylogo() throws IOException {
		
		
		TakesScreenshot o = ((TakesScreenshot)driver);
	File source	= o.getScreenshotAs(OutputType.FILE);
		String path = "D:\\defectscreenshot\\logo1.png";
		File desti = new File(path);
	FileHandler.copy(source, desti);
	
	}
	
	

	
	
}
