//Q1- Launch Firefox browser & navigate to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
 //B-Try to Dismiss the popup.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question1B{

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        obj.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/button[1]")).click();
        obj.switchTo().alert().dismiss();
    }
}


