import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Question6a {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get(" https://demoqa.com/browser-windows");
        obj.findElement(By.id("windowButton")).click();
        String Mainwindow = obj.getWindowHandle();
        String childWindow = obj.getWindowHandles().toArray()[1].toString();

        obj.switchTo().window(childWindow);
           System.out.println(obj.switchTo().activeElement().getText());
                obj.close();

        obj.switchTo().window(Mainwindow);
                 }
        }
