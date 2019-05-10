package bobcat.author;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cognifide.qa.bb.junit5.guice.Modules;
import com.cognifide.qa.bb.modules.BobcatRunModule;
import com.cognifide.qa.bb.page.BobcatPageFactory;
import com.google.inject.Inject;
import org.openqa.selenium.chrome.ChromeOptions;
import bobcat.author.pageobjects.AuthorLoginPage;
import bobcat.author.pageobjects.LoginPage;
import bobcat.author.pageobjects.TitlePage;

@Modules(BobcatRunModule.class)
public class LoginTest {

  //private static final String SEARCH_QUERY = "hello world";
  //private static final String HEADING = "\"Hello, World!\" program";

  @Inject
  private BobcatPageFactory bobcatPageFactory;

  @Inject
  private TitlePage titlePage;

  @Test
  public void loginSearchTest() {
   System.setProperty("webdriver.chrome.driver", '/usr/bin/chromedriver.exe');
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--no-sandbox"); // Bypass OS security model
	  options.addArguments("start-maximized"); // open Browser in maximized mode
	  options.addArguments("disable-infobars"); // disabling infobars
	  options.addArguments("--disable-extensions"); // disabling extensions
	  options.addArguments("--disable-gpu"); // applicable to windows os only
	  options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	
	  WebDriver driver = new ChromeDriver(options);
	  driver.get("https://google.com");
    AuthorLoginPage authorPage = bobcatPageFactory.create("http://localhost:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown", AuthorLoginPage.class);
    authorPage.open().login("admin","admin");
    
    LoginPage homePage = bobcatPageFactory.create("http://localhost:4502/content/etap/loginpage.html", LoginPage.class);
    homePage.open().login("chandreyee","chandreyee");
    assertThat(titlePage.getHeading(), is("This is the English page"));
    System.out.println("Result3");
  }
}
