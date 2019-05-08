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
public class LoginPage extends Page<LoginPage> {

  @Inject
  private WebDriver webDriver;

 // @FindBy(id="userId") //method used to find WebElement, in that case Id
 // WebElement loginTextbox;
  
  //@FindBy(id="inputPassword")
  //WebElement passwordTextBox;
  
  //@FindBys({
	  //  @FindBy(id="userId"),
	 //   @FindBy(id="inputPassword")
	//})
	//private List<WebElement> bothcriteria;
   //@FindBy(id = "userId")
 //  private SearchComponent searchComponent;
  

 // public SearchComponent getSearchComponent() {
   // return searchComponent;
  
  @FindBy(id="userId") //method used to find WebElement, in that case Id
  private WebElement loginTextbox;
  
  @FindBy(id="inputPassword")
  private WebElement passwordTextBox;
  
  @FindBy(id="loginButton")
  private WebElement loginButton;

  public void login(String username, String password) {
	// login method prepared according to Page Object Pattern
      loginTextbox.sendKeys(username);
      passwordTextBox.sendKeys(password);
      loginButton.click();
  }

}
