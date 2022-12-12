package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class Elements {

	WebDriver driver;
	
	@FindBy(xpath="//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")
	WebElement loginbtn;
	@FindBy(xpath="//input[@id='user']")
	WebElement email;
	@FindBy(xpath="//input[@id='login']")
	WebElement btn;
	@FindBy(xpath="//input[@id='password']")
	WebElement paswrd;
	@FindBy(xpath="//button[@id='login-submit']")
	WebElement loginsubmit;
	
	@FindBy(xpath="//div[@class='board-tile mod-add']")
	WebElement createboard;
	@FindBy(xpath="//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
	WebElement boardname;
	@FindBy(xpath="//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")
	WebElement createclassbtn;
	
	@FindBy(xpath="//span[@class='placeholder']")
	WebElement addlistbtn;
	@FindBy(xpath="//input[@class='list-name-input']")
	WebElement listname;
	@FindBy(xpath="//input[@type='submit']")
	WebElement Add;

	@FindBy(xpath="//*[contains(@href,'/b/znvglUPK/')]")
	WebElement FirstBoard;
	
	//task5
	@FindBy(xpath="//span[@class='list-card-title js-card-name']")
	WebElement Card;
	
	@FindBy(xpath="//a[@class='quick-card-editor-buttons-item js-move-card']")
	WebElement movebtn;
	
	@FindBy(xpath="//select[@class='js-select-list']")
	WebElement list;
	
	@FindBy(xpath="//input[@value='Move']")
	WebElement movetobtn;
	
	@FindBy(xpath="//textarea[@class='list-card-edit-title js-edit-card-title']")
	WebElement texttochange;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement savechangename;
	
	@FindBy(xpath="//span[@class='list-card-title js-card-name']")
	WebElement selectcard;
	
	@FindBy(xpath="//span[@title='Archive']")
	WebElement Archievebtn;
	
	@FindBy(xpath="//a[@title='Delete']")
	WebElement deletebtn;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement finaldelete;
	
	@FindBy(xpath="//div[@class='board-tile-details is-badged']")
	WebElement opentable;

	@FindBy(xpath="//a[@class='open-card-composer js-open-card-composer']")
	WebElement select;
	
	public Elements(WebDriver d)	
	{
		driver=d;
		PageFactory.initElements(d,this);
		
	}
	
	public void task1() throws InterruptedException
	{
		System.out.println("t1");
		Thread.sleep(2000);
		loginbtn.click();
		Thread.sleep(2000);
		email.sendKeys("muhammadshoaibajk@gmail.com");
		btn.click();
		Thread.sleep(2000);
		paswrd.sendKeys("PAKistan@123");
		Thread.sleep(1000);
		loginsubmit.click();
		Thread.sleep(3000);
		
		System.out.println("Hy");
	}
	
	public void task2() throws InterruptedException
	{
		System.out.println("t2");
		createboard.click();
		
		Faker fake= new Faker();			//to create random name for board
		String name=fake.name().firstName();
		Thread.sleep(2000);
		boardname.sendKeys(name);
		createclassbtn.click();
		Thread.sleep(3000);
	}
	
	public void task3() throws InterruptedException
	{
		System.out.println("t3");
		//driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		opentable.click();
		Thread.sleep(3000);
		addlistbtn.click();
		Thread.sleep(500);
		Faker fake= new Faker();			//to create random name for board
		String name=fake.name().firstName();
		listname.sendKeys(name);
		Add.click();
		Thread.sleep(1000);
		name=fake.name().firstName();
		listname.sendKeys(name);
		Add.click();
		
		
	}
	
	public void task4() throws InterruptedException
	{
		System.out.println("t4");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		opentable.click();
		Thread.sleep(3000);
//		FirstBoard.click();
		//driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
		select.click();
		Thread.sleep(1000);
		Faker fake= new Faker();			//to create random name for board
		String list=fake.name().firstName();
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys(list);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		
	}
	
	public void task5() throws InterruptedException
	{
		//upr c copy ke h POM bhi copy krna
		//driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		opentable.click();
//		Board.click();
		Thread.sleep(3000);
//		FirstBoard.click();
		//driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
		select.click();
		System.out.print("aja bhai 5");
		Actions actions = new Actions(driver);
		WebElement elementLocator = Card;
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		movebtn.click();
		Thread.sleep(1000);
		Select dd=new Select(list);
		Thread.sleep(1000);
		dd.selectByIndex(1);
		Thread.sleep(1000);
		movetobtn.click();
		
	}
	
	public void task6() throws InterruptedException
	{
		//upr c copy ke h POM bhi copy krna
		//driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		opentable.click();
//		Board.click();
		Thread.sleep(3000);
//		FirstBoard.click();
		//driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
		select.click();
		Actions actions = new Actions(driver);
		WebElement elementLocator = Card;
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		texttochange.sendKeys("Text Changed");
		Thread.sleep(1000);
		savechangename.click();
				
	}
	
	public void task7() throws InterruptedException
	{
		//upr c copy ke h POM bhi copy krna
		//driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		opentable.click();
//		Board.click();
		Thread.sleep(3000);
//		FirstBoard.click();
		//driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
		select.click();
		Thread.sleep(2000);
		selectcard.click();
		Thread.sleep(2000);
		Archievebtn.click();
		Thread.sleep(1000);
		deletebtn.click();
		Thread.sleep(1000);
		finaldelete.click();
	
	}

}
