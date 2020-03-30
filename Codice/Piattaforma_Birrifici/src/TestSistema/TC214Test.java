// Generated by Selenium IDE
package TestSistema;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC214Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC214() {
    driver.get("http://localhost:8080/Piattaforma_Birrifici/Home.jsp");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector(".slidesotto:nth-child(1) li:nth-child(2) > a")).click();
    driver.findElement(By.cssSelector("p:nth-child(2)")).click();
    driver.findElement(By.id("in")).click();
    driver.findElement(By.id("in")).sendKeys("03214583694");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("bigsansu.info@gmail.com");
    driver.findElement(By.name("rs")).click();
    driver.findElement(By.name("rs")).sendKeys("Bigsansu");
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("via del Centenario, 54");
    driver.findElement(By.name("privacy")).click();
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("12_54.:36");
    driver.findElement(By.cssSelector(".but:nth-child(1)")).click();
  }
}
