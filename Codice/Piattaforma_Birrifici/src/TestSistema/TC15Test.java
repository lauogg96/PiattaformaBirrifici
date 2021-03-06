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
public class TC15Test {
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
  public void tC15() {
    driver.get("localhost:8081/Piattaforma_Birrifici/Home.jsp/Piattaforma_Birrifici/Home.jsp");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.cssSelector(".slidesotto:nth-child(1) li:nth-child(1) > a")).click();
    {
      WebElement element = driver.findElement(By.id("in"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("in"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("in"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("in")).click();
    driver.findElement(By.id("in")).sendKeys("atlandi@gmail.it");
    driver.findElement(By.name("p")).sendKeys("1234567+");
    driver.findElement(By.name("n")).click();
    driver.findElement(By.name("n")).sendKeys("Antonio");
    driver.findElement(By.name("c")).sendKeys("l");
    driver.findElement(By.name("c")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("c")).sendKeys(Keys.TAB);
    driver.findElement(By.name("i")).sendKeys("v");
    driver.findElement(By.name("i")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("i")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("i")).sendKeys(Keys.TAB);
    driver.findElement(By.name("t")).sendKeys("3");
    driver.findElement(By.name("t")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("t")).sendKeys(Keys.TAB);
    driver.findElement(By.name("privacy")).click();
    driver.findElement(By.cssSelector(".but:nth-child(1)")).click();
  }
}
