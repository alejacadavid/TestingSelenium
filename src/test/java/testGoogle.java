import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testGoogle {

    WebDriver driver = null;


    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver", "/home/s4n/chromedriver");

        driver = new ChromeDriver();
    }


    @After
    public void liquidarDriver() {
        driver.close();
    }


    @Test
    public void testGoogle(){


        driver.get("http://www.google.com/");
        WebElement enterQuery = driver.findElement(By.id("lst-ib"));
        enterQuery.sendKeys("Hola");

    }
}
