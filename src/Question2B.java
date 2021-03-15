import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Question2B{
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        Select value=new Select(obj.findElement(By.id("multi-select")));
        List<WebElement> option = value.getOptions();
        int size = option.size();
        for(int i =0; i<size ; i++){
            String options = option.get(i).getText();
            System.out.println(options);
        }
        }
    }

