import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Question4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ttn/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("singleframe");
        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("priya");
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Soni");
    }
}

