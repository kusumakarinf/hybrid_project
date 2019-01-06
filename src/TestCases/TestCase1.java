package TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataAccess.DataDriven;
import ObjectAccess.ObjectReader;

public class TestCase1 {
  @Test
  public void f() throws IOException 
  {
	  WebDriver driver = new ChromeDriver();
	 
	  try
	  {
	  
		 // Properties prop = ObjectReader.getProperties();
		 // System.out.println(prop.getProperty("url"));
		
		  //  String urlPath = ObjectReader.getProperties().getProperty("url");
	  //System.out.println(urlPath);
		  
		  //driver.get(prop.getProperty("url"));
		  //driver.get(ObjectReader.getProperties().getProperty("url"));
	  
		  String[][] searchValue = DataDriven.DataAccess();
		  //System.out.println("Array Value is  : "+searchValue[0][0]);
		  for(int i=0;i<2;i++)
		  {
			  driver.get(ObjectReader.getProperties().getProperty("url"));
			  System.out.println(ObjectReader.getProperties().getProperty("googleSearch"));
			  
			  //String[][] searchValue = DataDriven.DataAccess();
			  driver.findElement(By.xpath(ObjectReader.getProperties().getProperty("googleSearch"))).sendKeys(searchValue[i][0]); 
			  driver.findElement(By.xpath(ObjectReader.getProperties().getProperty("googleSearch"))).sendKeys(Keys.ENTER); 
			  
			//  driver.findElement(By.name(ObjectReader.getProperties().getProperty("searchButton"))).click();
		  }
	  
	 }
	 catch(Throwable e)
	 {
		 System.out.println(e.getMessage());
	 }
	 
	 finally
	 {
	  driver.close();
	 }
  }
  
  
  @Test
  public void f1() throws IOException 
  {
	  WebDriver driver = new ChromeDriver();
	 
	  try
	  {	  
		  
		  String[][] searchValue = DataDriven.DataAccess();
		  //System.out.println("Array Value is  : "+searchValue[0][0]);
		  for(int i=0;i<2;i++)
		  {
			  driver.get(ObjectReader.getProperties().getProperty("url2"));
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//	  System.out.println(ObjectReader.getProperties().getProperty("googleSearch"));
			  
			  //String[][] searchValue = DataDriven.DataAccess();
			  driver.findElement(By.id(ObjectReader.getProperties().getProperty("searchId"))).sendKeys(searchValue[i][0]); 
			  driver.findElement(By.xpath(ObjectReader.getProperties().getProperty("searchButtonXPath"))).click();

		  }
	  
	 }
	 catch(Throwable e)
	 {
		 System.out.println(e.getMessage());
	 }
	 
	 finally
	 {
	  driver.close();
	 }
  }
  
  
}
