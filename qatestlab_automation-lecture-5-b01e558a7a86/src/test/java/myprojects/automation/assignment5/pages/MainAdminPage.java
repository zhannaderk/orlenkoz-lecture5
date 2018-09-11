package myprojects.automation.assignment5.pages;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainAdminPage {

    private WebDriver webDriver;

    @Getter
    private By imgLogo = By.id("header_logo");

    public MainAdminPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
