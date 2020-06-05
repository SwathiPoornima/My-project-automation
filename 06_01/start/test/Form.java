import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tejapoornima/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Swathi Poornima");

        driver.findElement(By.id("last-name")).sendKeys("Pandravada");

        driver.findElement(By.id("job-title")).sendKeys("Software QA Engineer");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("06/01/2015");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
