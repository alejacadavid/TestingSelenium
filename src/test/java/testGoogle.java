import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testGoogle {

    private static WebDriver driver = null;

    @BeforeClass
    public static void inicializarDriver() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
    }

/*
    @AfterClass
    public static void liquidarDriver() {
        driver.quit();
    }
*/


    @Test
    public void testGoogle(){
        driver.get("http://www.google.com/");
        WebElement enterQuery = driver.findElement(By.id("lst-ib"));
        //enterQuery.sendKeys("Hola");

    }
}
