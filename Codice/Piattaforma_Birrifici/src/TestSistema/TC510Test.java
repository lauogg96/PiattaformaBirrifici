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
public class TC510Test {
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
  public void tC510() {
    driver.get("http://localhost:8080/Piattaforma_Birrifici/Home.jsp");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Login Venditore")).click();
    driver.findElement(By.cssSelector(".but")).click();
    driver.findElement(By.cssSelector("td:nth-child(1) img")).click();
    driver.findElement(By.id("in")).click();
    driver.findElement(By.id("in")).sendKeys("Weiss");
    driver.findElement(By.id("field")).click();
    driver.findElement(By.name("colore")).click();
    driver.findElement(By.name("colore")).sendKeys("Bionda");
    driver.findElement(By.name("gradazione")).click();
    driver.findElement(By.name("descrizione")).click();
    driver.findElement(By.name("descrizione")).sendKeys("		Rinfrescante e fruttata");
    driver.findElement(By.name("quantitaAgg")).click();
    driver.findElement(By.name("quantitaAgg")).sendKeys("5");
    driver.findElement(By.name("prezzo")).click();
    driver.findElement(By.name("prezzo")).sendKeys("6");
    driver.findElement(By.id("bottoneInvia")).click();
  }
}
