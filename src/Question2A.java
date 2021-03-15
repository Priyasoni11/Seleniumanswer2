import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Question2A {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        Select value=new Select(obj.findElement(By.id("multi-select")));
        if(value.isMultiple()){
            System.out.println("The dropdown is multiple dropdown");
        }else {
            System.out.println("not a multi");
        }
    }

}
