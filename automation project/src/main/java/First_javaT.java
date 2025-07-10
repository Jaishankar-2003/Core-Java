import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_javaT {
    public static void main (String[] arg) {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url
        //driver.get("https://letcode.in/");
        //driver.get("https://letcode.in/login/");
        driver.get("https://letcode.in/edit/");

        // LOCATORS IN SELENIUM

        //click login button
        //driver.findElement(By.linkText("Explore Workspace")).click();

        //enter emain find element by name
        /*driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("mor_2314");
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("83r5^_");
        driver.findElement(By.xpath("//button['Login']")).click();
         */

        // HANDLING IN SELENIUM

        //enter the full name
        driver.findElement(By.id("fullName")).sendKeys("jaishankar");

        //append text and press keyword
        driver.findElement(By.id("join")).sendKeys("person", Keys.TAB);

        //what inside the text box
        String Value = driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println(Value);

        //clear the text



    }

}
