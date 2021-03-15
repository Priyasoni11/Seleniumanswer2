//Q1- Launch Firefox browser & navigate to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
//A- Try to Fetch the alert popup text.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question1A{

        public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
            WebDriver obj = new FirefoxDriver();
            obj.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

            obj.findElement(new By.ByCssSelector("button[class='btn btn-default']")).click();
          String value= obj.switchTo().alert().getText();
            System.out.println(value);
        }
    }

