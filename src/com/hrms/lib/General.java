package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.hrms.utility.Log;
import org.testng.Reporter;

public class General extends Global{
//To provide all re-usable fun related to whole application
public void openApplication() {
driver = new ChromeDriver();
driver.navigate().to(url);
System.out.println("Application opened");
Reporter.log("Application Opened"); //TestNG- htmlReport
Log.info("Application opened "); //log4j- logfile
}
public void closeApplication() {
    driver.close();
System.out.println("Application closed");
Log.info("Application closed ");
}
public void login() {
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.name(txt_password)).sendKeys(pw);
driver.findElement(By.name(btn_login)).click();
System.out.println("Login completed");
Log.info("Login completed ");
}
public void logout() {
driver.findElement(By.linkText(link_logout)).click();
System.out.println("Logout completed");
Log.info("logout completed ");
}
public void enterFrame() {
driver.switchTo().frame(frame_empinfo);
System.out.println("Entered into Frame");
Log.info("Enter frame ");
}
public void exitFrame() {
driver.switchTo().defaultContent();
System.out.println("Exit from frame");
Log.info("Exit from ");
}

public void addNewEmp() {
driver.findElement(By.xpath(btn_Add)).click();    
driver.findElement(By.name(txt_efn)).sendKeys(efn);
driver.findElement(By.name(txt_eln)).sendKeys(eln);
driver.findElement(By.id(btn_save)).click();
System.out.println("New Emp Added");
Log.info("New emp added ");
}
}