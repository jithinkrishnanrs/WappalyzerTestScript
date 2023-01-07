import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wappalyzer.com/");
        WebElement resources = driver.findElement(By.xpath("//span[normalize-space()='Resources']"));
        resources.click();

        WebElement technologies = driver.findElement(By.cssSelector("a[id='list-item-50'] div[class='v-list-item__content py-4']"));
        technologies.click();

        WebElement shopify = driver.findElement(By.cssSelector("//a[@href='/technologies/ecommerce/shopify/']//div[@class='v-card v-card--flat v-sheet theme--dark transparent']//div[@class='v-card__text d-flex align-center pa-0']"));
        shopify.click();

        WebElement click_button = driver.findElement(By.xpath("//a[@class='mt-2 v-btn v-btn--has-bg v-btn--router theme--dark v-size--large primary']"));
        click_button.click();

        WebElement technologies_dropdown = driver.findElement(By.cssSelector("div[value='technologies'] button[type='button']"));
        technologies_dropdown.click();

        WebElement input_text = driver.findElement(By.id("input-952"));
        input_text.sendKeys("Java");

        System.out.println("Test Success");

        driver.quit();   
    }
}