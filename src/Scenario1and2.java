import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scenario1and2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Scenario 1
        WebElement user = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.id("login-button"));

        user.sendKeys("standard_user");
        pass.sendKeys("secret_sauce");

        submit.click();

        Thread.sleep(3000);

        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));

        menu.click();

        WebElement log = driver.findElement(By.id("logout_sidebar_link"));

        log.click();

        //Scenario2
        Thread.sleep(3000);

        WebElement user1 = driver.findElement(By.id("user-name"));
        WebElement pass1 = driver.findElement(By.id("password"));
        WebElement submit1 = driver.findElement(By.id("login-button"));

        user1.sendKeys("locked_out_user");
        pass1.sendKeys("secret_sauce");

        submit1.click();

        Thread.sleep(3000);

        driver.quit();
    }
}