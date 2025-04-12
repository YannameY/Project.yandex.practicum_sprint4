package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageScooter {

    private static WebDriver driver;

    public LandingPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    private By ButtonCookie = By.xpath(".//button[text()='да все привыкли']");


    public void clickButtonCookie() {
        driver.findElement(ButtonCookie).click();
    }

    public void scrollToLanding() {
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }


    static String closedDropdownLocatorFormat = "accordion__heading-%d";
    public static String textInputLocatorFormat = "accordion__panel-%d";

    // Метод для клика по закрытому дропдауну с использованием форматирования локатора
    public static void clickClosedDropdownByIndex(int index) {
        driver.findElement(By.id(String.format(closedDropdownLocatorFormat, index))).click();
    }

    // Метод для получения текста из текстового поля с использованием форматирования локатора
    public static String getTextFromTextInputByIndex(int index) {
        return driver.findElement(By.id(String.format(textInputLocatorFormat, index))).getText();
    }
}
