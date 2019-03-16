import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scrapping {

    public static <string> void main(String... args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zap.md/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[class='term-browser-item telefoane']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("telefoane mobile")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("preț: mare spre mic")).click();


        //pentru a pune toate elementele in liste
        List<WebElement> listpret = driver.findElements(By.className("current-price"));
        List<WebElement> listnume = driver.findElements(By.className("views-field-title"));


        // listile cu pret si nume
        List<String> pretelemente = new ArrayList<String>();
        List<String> numeelemente = new ArrayList<String>();

        for (int i = 0; i < listpret.size(); i++) {

            //incarcarea textului fiecarui element in array
            numeelemente.add(listnume.get(i).getText());
            pretelemente.add(listpret.get(i).getText());

            //pentru afisare in consola
            System.out.println(listnume.get(i).getText());
            System.out.println(listpret.get(i).getText());

            System.out.println();
        }
        // afisarea elementului cu cel mai mic pret
        System.out.println("Pret minim: " + Collections.min(pretelemente));
    }
}