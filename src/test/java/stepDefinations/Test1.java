package stepDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Cucumber\\GRhombus_Cucumber\\drivers\\chromedriver.exe");


        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://mystudy.qa.medable.com/?org=pawabqaauto");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();



      //  add cookies
        Cookie ck = new Cookie("x-md-web-apps-deployment", "production");
        driver.manage().addCookie(ck);
        Cookie ck1 = new Cookie("x-md-web-apps-version", "1.3.4-rc.4");
        driver.manage().addCookie(ck1);
        driver.navigate().refresh();

        System.out.println(driver.manage().getCookies());



        WebDriverWait wait = new WebDriverWait(driver, 30);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));

        driver.findElement(By.xpath("//button[text()='Sign In']")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("carlos.escribano+chall2@medable.com");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Medable123$");

        driver.findElement(By.xpath("//button[@type='submit']")).click();



        wait.until(ExpectedConditions.textToBe(By.xpath("//button[@type='button']"), "Sign Out"));
        System.out.println(driver.findElement(By.xpath("//button[@type='button']")).getText() + " Was Able to Login And Can Find Logout Button");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Form Step Task']")));
        System.out.println(driver.findElement(By.xpath("//p[text()='Form Step Task']")).getText());
        driver.findElement(By.xpath("//p[text()='Form Step Task']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("a@a.com");

        driver.findElement(By.id("5f495246a0a6f70100d5e395_text")).sendKeys("Automation");

        driver.findElement(By.xpath("//input[@id='5f495246a0a6f70100d5e3d2_numeric']")).sendKeys("21");


        driver.findElement(By.xpath("//div[text()='Select an answer']")).click();
        driver.findElement(By.xpath("//div[text()='Option 2']")).click();

        driver.findElement(By.id("5f495247a0a6f70100d5e518_boolean_0")).click();

        driver.findElement(By.xpath("//div[@tabindex='5']")).click();


        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Córdoba");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.DOWN,Keys.DOWN, Keys.RETURN);


        driver.findElement(By.xpath("(//div[@tabindex='2'])[2]")).click();


    }
}