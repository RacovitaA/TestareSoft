import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///D:\\Univer\\TS\\lab1\\logare.html");
        Thread.sleep(1000);
        driver.findElement(By.id("text")).sendKeys("utm");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("pas");
        Thread.sleep(1000);
        driver.findElement(By.id("log")).click();
        Thread.sleep(1000);

        try {
            driver.findElement(By.id("logat"));
            System.out.println("Testat cu succes");
        } catch (NoSuchElementException e) {
            System.out.println("Eroare test");
        }
    }
}











