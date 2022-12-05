package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps 
{
	public WebDriver driver;

	@Given("open the Browsers")
	public void open_the_browsers() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.indiamart.com");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
	System.out.println("the Screenshot is taken");

	}

	@When("enter a the url {string}")
	public void enter_a_the_url(String string) {


	}

	@When("click Building and Constructions on middle area")
	public void click_building_and_constructions_on_middle_area() throws Exception {
	driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
	TakesScreenshot tsa = (TakesScreenshot)driver;
	File sourcea = tsa.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcea, new File("./Screenshots/test.png"));
	System.out.println("the Screenshot is taken");
	
	driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Plywoods']")).click();
	TakesScreenshot tsb = (TakesScreenshot)driver;
	File sourceb = tsb.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceb, new File("./Screenshots/test1.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Laminate Sheets']")).click();
	TakesScreenshot tsd = (TakesScreenshot)driver;
	File sourced = tsd.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourced, new File("./Screenshots/test02.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Wood Boards']")).click();
	TakesScreenshot tse = (TakesScreenshot)driver;
	File sourcee = tse.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcee, new File("./Screenshots/test3.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Wall Panels']")).click();
	TakesScreenshot tsf = (TakesScreenshot)driver;
	File sourcef = tsf.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcef, new File("./Screenshots/test4.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();

	//electronics and electrical


	driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
	TakesScreenshot tsg = (TakesScreenshot)driver;
	File sourceg = tsg.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceg, new File("./Screenshots/test5.png"));
	System.out.println("the Screenshot is taken");
	
	driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Solar Panels']")).click();
	TakesScreenshot tsh = (TakesScreenshot)driver;
	File sourceh = tsh.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceh, new File("./Screenshots/test6.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Solar Power Plants']")).click();
	TakesScreenshot tsi = (TakesScreenshot)driver;
	File sourcei = tsi.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcei, new File("./Screenshots/test7.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Solar Lighting']")).click();
	TakesScreenshot tsj = (TakesScreenshot)driver;
	File sourcej = tsj.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcej, new File("./Screenshots/test8.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();
	TakesScreenshot tsk = (TakesScreenshot)driver;
	File sourcek = tsk.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcek, new File("./Screenshots/test9.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();

	//drugs and pharma

	driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
	TakesScreenshot tsl = (TakesScreenshot)driver;
	File sourcel = tsl.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcel, new File("./Screenshots/test10.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Nutritional Supplements']")).click();
	TakesScreenshot tsm = (TakesScreenshot)driver;
	File sourcem = tsm.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcem, new File("./Screenshots/test11.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Weight Gain Nutrition']")).click();
	TakesScreenshot tsn = (TakesScreenshot)driver;
	File sourcen = tsn.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcen, new File("./Screenshots/test12.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Protein Powder']")).click();
	TakesScreenshot tso = (TakesScreenshot)driver;
	File sourceo = tso.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceo, new File("./Screenshots/test13.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Multivitamin Tablet']")).click();
	TakesScreenshot tsp = (TakesScreenshot)driver;
	File sourcep = tsp.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcep, new File("./Screenshots/test14.png"));
	System.out.println("the Screenshot is taken");

	//industrial machinery

	Thread.sleep(3000);
	driver.navigate().back();
	driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
	TakesScreenshot tsq = (TakesScreenshot)driver;
	File sourceq = tsq.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceq, new File("./Screenshots/test15.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Flat Knitting Machines']")).click();
	TakesScreenshot tsr = (TakesScreenshot)driver;
	File sourcer = tsr.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcer, new File("./Screenshots/test16.png"));
	System.out.println("the Screenshot is taken");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Industrial Sewing Machine']")).click();
	TakesScreenshot tss = (TakesScreenshot)driver;
	File sources = tss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sources, new File("./Screenshots/test17.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Embroidery Machine']")).click();
	TakesScreenshot tst = (TakesScreenshot)driver;
	File sourcet = tst.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourcet, new File("./Screenshots/test18.png"));
	System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Knitting Machines']")).click();
	TakesScreenshot tsu = (TakesScreenshot)driver;
	File sourceu = tsu.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceu, new File("./Screenshots/test19.png"));
	System.out.println("the Screenshot is taken");
	
	// industrial supplies
	
	 Thread.sleep(3000);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
	 TakesScreenshot tsv = (TakesScreenshot)driver;
		File sourcev = tsv.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcev, new File("./Screenshots/test20.png"));
		System.out.println("the Screenshot is taken");
	Thread.sleep(3000);
	
	 driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Packaging Tapes']")).click();
	 TakesScreenshot tsw = (TakesScreenshot)driver;
		File sourcew = tsw.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcew, new File("./Screenshots/test21.png"));
		System.out.println("the Screenshot is taken");
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='Sealing Tape']")).click();
	 TakesScreenshot tsx = (TakesScreenshot)driver;
		File sourcex = tsx.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcex, new File("./Screenshots/test22.png"));
		System.out.println("the Screenshot is taken");
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='Decorative Tape']")).click();
	 TakesScreenshot tsy = (TakesScreenshot)driver;
		File sourcey = tsy.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcey, new File("./Screenshots/test23.png"));
		System.out.println("the Screenshot is taken");
	 Thread.sleep(3000);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='Electric Tape']")).click();
	 TakesScreenshot tsz = (TakesScreenshot)driver;
		File sourcez = tsz.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcez, new File("./Screenshots/test24.png"));
		System.out.println("the Screenshot is taken");
	 driver.quit();
	 
	
	}
	@Then("user is navigate to the Building and Constructions")
	public void user_is_navigate_to_the_building_and_constructions() {
	   
	}


}
