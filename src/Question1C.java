//Queestion 1 C-Try to enter some data on an alert popup.
//D- Try to accept the popup.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1C {


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        obj.findElement(new By.ByCssSelector("button[onclick='myPromptFunction()']")).click();
        obj.switchTo().alert().sendKeys("Priya soni");
        obj.switchTo().alert().accept();  //answer for 1D
        }
}
