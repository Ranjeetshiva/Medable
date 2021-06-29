package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Cucumber\\GRhombus_Cucumber\\drivers\\chromedriver.exe");


        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://mystudy.qa.medable.com/?org=pawabqaauto");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
