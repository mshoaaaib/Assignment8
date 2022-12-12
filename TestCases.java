package Assignment8;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestCases {
	
	WebDriver driver=new ChromeDriver();
	Elements task =new Elements(driver);
	
	@BeforeMethod
	public void beforemethod()
		{
		 driver.get("https://trello.com/");
		}
	
	//login function
  @Test
  public void Task1() throws InterruptedException {
	 
	  task.task1();
  	}
  
  @Test
  public void Task2() throws InterruptedException
  {
	  task.task2();
  }
  
  @Test
  public void Task3() throws InterruptedException
  {
	  task.task3();
  }
  
  @Test
  public void task4() throws InterruptedException
  {
	  task.task4();
  }
  
  @Test
  public void task5() throws InterruptedException
  {
	  task.task5();
  }
  
  @Test
  public void task6() throws InterruptedException
  {
	  task.task6();
  }
  
  @Test
  public void task7() throws InterruptedException
  {
	  task.task7();
  }
  
  @AfterMethod
  public void aftertasks()
	  {
		  driver.close();
	  }
  
}
