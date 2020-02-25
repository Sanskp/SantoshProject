package pom;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstant	
{
	@FindBy(id ="userName")
	private WebElement usernametextfield;
	
	@FindBy(id = "usrPwd")
	private WebElement passwordtextfield;
	
	@FindBy(id = "cnfUsrPwd")
	private WebElement cnfpasswordtextfield;
	
	@FindBy(xpath = "( //div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]")
	private WebElement SecurityDropdownlist;
	
	@FindBy(xpath = "(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]/../../../../..//span[.='What is your pet name?']")
	private WebElement  Question;
	
	@FindBy(xpath = "//input[@placeholder='Security Answer']")
	private WebElement securityanswertextfield;
	
	@FindBy(xpath = "//label[.='Select Preferred Language']")
	private WebElement langaugeDropDownList;
	
	@FindBy(xpath = "(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[2]/../../..//span[.='English']")
	private WebElement English;
	
	@FindBy(id = "firstName")
	private WebElement Firstnametextfield;
	
	@FindBy(id = "middleName")
	private WebElement Middlenametextfield;
	
	@FindBy(id = "lastname")
	private WebElement Lastnametextfield;
	
	@FindBy(id = "M")
	private WebElement genderradiobutton;
	
	@FindBy(xpath = "//input[@class='ng-tns-c11-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	private WebElement dateclickbutton;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month ng-tns-c11-6 ng-star-inserted']")
	private WebElement selectmonthdropdown;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year ng-tns-c11-6 ng-star-inserted']")
	private WebElement selectyeardropdown;
	
	@FindBy(xpath = "//a[.='20']")
	private WebElement selectdate;

	@FindBy(xpath = "(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[3]")
	private WebElement selectoccupation;	 
	
	@FindBy(xpath = "//span[.='STUDENT']")
	private WebElement selectstudent;
	
	@FindBy(xpath = "//label[contains(text(),' Unmarried')]")
	private WebElement MaritalStatusradiobutton;
	
	@FindBy(id = "email")
	private WebElement emailidtextfield;
	
	@FindBy(id = "mobile")
	private WebElement mobiletextfield;
	
	@FindBy(xpath = "//select[@formcontrolname='nationality']")
	private WebElement selectnationality;
	
	@FindBy(id = "resAddress1")
	private WebElement selectaddresstextfield;
	
	@FindBy(id = "resAddress2")
	private WebElement selectaddressfield2;
	
	@FindBy(id = "resAddress3")
	private WebElement selectaddressfield3;
	
	@FindBy(xpath = "//input[@placeholder='Pin code']")
	private WebElement selectpincodetextfield;
	
	@FindBy(xpath = "//select[@formcontrolname='resCity']")
	private WebElement selectcitydropdownlist;
	
	@FindBy(xpath = "//select[@formcontrolname='resPostOff']")
	private WebElement selectpostoffice;
	
	@FindBy(id = "resPhone")
	private WebElement phonetextfield;
	
	@FindBy(xpath = "(//input[@class='ng-valid ng-dirty ng-touched'])[3]")
	private WebElement AddressRadioButton;

	public POMFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void submit() throws IOException, InterruptedException
   {
	usernametextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 0));
	passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 1));
	cnfpasswordtextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 2));
	Thread.sleep(5000);
	SecurityDropdownlist.click();
	Thread.sleep(7000);
	Question.click();
	securityanswertextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 3));
	Thread.sleep(5000);
	langaugeDropDownList.click();
	Thread.sleep(5000);
	English.click();
	Thread.sleep(3000);
	Firstnametextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 4));
	Thread.sleep(3000);
	Middlenametextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 5));
	Thread.sleep(3000);
	Lastnametextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 1, 6));
	Thread.sleep(3000);
	genderradiobutton.click();
	Thread.sleep(5000);
	dateclickbutton.click();
	selectbyvisibletext(selectmonthdropdown, "May");
	selectbyvisibletext(selectyeardropdown, "1993");
	selectdate.click();
	selectoccupation.click();
	Thread.sleep(3000);
	selectstudent.click();
	Thread.sleep(3000);
	MaritalStatusradiobutton.click();
	emailidtextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 0));
	Thread.sleep(5000);
	mobiletextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 1));
	Thread.sleep(5000);
	selectbyvisibletext(selectnationality,"India");
	selectaddresstextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 2));
	selectaddressfield2.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 3));
	selectaddressfield3.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 4));
	Thread.sleep(5000);
	selectpincodetextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 5));
	selectpincodetextfield.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	selectbyvisibletext(selectcitydropdownlist, "Ganjam");
	Thread.sleep(5000);
	selectbyvisibletext(selectpostoffice, "Berhampur(GM) H.O");
	phonetextfield.sendKeys(ExcelLibrary.getcellvalue(Excelpath, sheetname, 3, 6));
	AddressRadioButton.click();
   }
    
}