import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Question5A {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/ttn/geckodriver");
        WebDriver driver = new FirefoxDriver();
   driver.get(" http://demo.automationtesting.in/Frames.html");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);

        driver.findElement(By.linkText("Iframe with in an Iframe")).click();

    driver.switchTo().frame(1); // Switching to innerframe
    driver.switchTo().frame(0); // Switching to innerframe
        System.out.println("inner frame");
    }
    }

