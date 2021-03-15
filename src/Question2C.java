import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Question2C{
    public static void main(String[] args) throws InterruptedException {
//      System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        System.setProperty("webdriver.chrome.driver","/home/ttn/chromedriver");
       WebDriver obj = new ChromeDriver();
//        WebDriver obj=new FirefoxDriver();
        obj.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        obj.manage().window().maximize();
        Select value=new Select(obj.findElement(By.id("multi-select")));
        value.selectByIndex(1);
        value.selectByIndex(2);
        value.selectByIndex(5);
     obj.findElement(By.id("printMe")).click();//working in chrome
//      obj.findElement(By.id("printAll")).click();
        Thread.sleep(4000);
      value.deselectAll();// part2D
             }
}

