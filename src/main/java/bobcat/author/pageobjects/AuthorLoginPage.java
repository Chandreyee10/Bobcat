package bobcat.author.pageobjects;

import com.cognifide.qa.bb.page.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.qualifier.PageObject;
import com.google.inject.Inject;


import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


@PageObject
public class AuthorLoginPage extends Page<AuthorLoginPage> {

  @Inject
  private WebDriver webDriver;
  
  @FindBy(id = "username")
  private WebElement usernameField;
  
  @FindBy(id = "password")
  private WebElement passwordField;
      
  @FindBy(css = "button[type=submit]")
  private WebElement submitButton;

  public void login(String username, String password) {
      usernameField.sendKeys(username);
      passwordField.sendKeys(password);
      submitButton.click();
 }
  

}
