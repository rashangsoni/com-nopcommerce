package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    // 1. Setup Chrome browser
    static String browser = "Chrome";
    // 2. Open URL
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2\n" + "\n" + "F";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // 4. Print the current url
        System.out.println("Current Url : " + driver.getCurrentUrl());
        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());
        // 6. Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("rashangs@yahoo.co.uk");
        // 7. Enter the password to password field
        WebElement passwordfield = driver.findElement(By.id("Password"));
        passwordfield.sendKeys("Jaisrikrishana@12");
        // 8. Close the browser
          driver.close();

    }
}
