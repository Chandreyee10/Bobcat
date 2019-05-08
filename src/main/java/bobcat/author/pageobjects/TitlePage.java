package bobcat.author.pageobjects;

import java.util.Collections;
import com.cognifide.qa.bb.constants.Timeouts;
import com.cognifide.qa.bb.wait.BobcatWait;
import com.google.inject.Inject;

import io.netty.handler.timeout.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.StaleElementReferenceException;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

@PageObject
public class TitlePage {

  @Inject
  private BobcatWait bobcatWait;

  @FindBy(id ="title")
  private WebElement heading;
 
 
  public String getHeading(){
	 System.out.println("Inside1 heading");
	 bobcatWait
	 //ignoring(Collections.singletonList(StaleElementReferenceException.class))
	 .until(ExpectedConditions.visibilityOf(heading));
	 //.until(ExpectedConditions.titleIs(heading));
	 System.out.println("Inside heading");
	 //String result = bobcatWait.isConditionMet(ExpectedConditions.visibilityOf(heading));
	// System.out.println("Chandreyee"+result);
     return heading.getText();
    
    
    //WebElement element = bobcatWait.until(ExpectedConditions.visibilityOf(testedElement));

    //boolean result = bobcatWait.isConditionMet(ExpectedConditions.visibilityOf(testedElement));
  }
}
