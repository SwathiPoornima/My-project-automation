import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class LoginFacebook {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/tejapoornima/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement email = driver.findElement(By.id("email"));
        Actions actions = new Actions(driver);
        actions.moveToElement(email);
        email.sendKeys("swatzprincess@yahoo.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("imemyself");
        sleep(1000);

        WebElement button = driver.findElement(By.id("u_0_b"));
        button.click();
        sleep(5000);

        driver.quit();

    }
}
