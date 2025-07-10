import org.openqa.selenium.By;
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
        driver.get("https://letcode.in/login/");


        //click login button
        //driver.findElement(By.linkText("Explore Workspace")).click();

    }

}
