package com.cg.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageRepo {

	WebDriver driver;
	public RegistrationPageRepo(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="title")
	WebElement title;
    
	@FindBy(id="ownername")
	WebElement owner;
	
	@FindBy(xpath="/html/body/form/ul/li[7]/input")
	WebElement gender;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
  	@FindBy(id="state")
  	WebElement state;
  	
  	@FindBy(name="country")
  	WebElement country;
  	
  	@FindBy(id="zip")
  	WebElement zip;
  	
  	@FindBy(xpath="/html/body/form/ul/li[19]/input")
  	WebElement vehicle;
  	
  	@FindBy(xpath="/html/body/form/ul/li[22]/input")
  	WebElement fuel;
  	
  	@FindBy(name="mfg")
  	WebElement mfg;
  	
  	@FindBy(name="submit")
  	WebElement submit;
  	
  	
  	
    public WebElement Title()
    {
    	return title;
    }
   
    public WebElement Owner()
    {
    	return owner;
    }
    
    public WebElement Gender()
    {
    	return gender;
    }
    
    public WebElement Address()
    {
    	return address;
    }
   
    public WebElement City()
    {
    	return city;
    }
    
    public WebElement State()
    {
    	return state;
    }
    
    
    public WebElement Country()
    {
    	return country;
    }
   
    public WebElement Zip()
    {
    	return zip;
    }
    
    public WebElement Vehicle()
    {
    	return vehicle;
    }
    
    public WebElement Fuel()
    {
    	return fuel;
    }
   
    public WebElement MFG()
    {
    	return mfg;
    }
    
    public WebElement Submit() 
    {
    	return submit;
    }
    
	
}
