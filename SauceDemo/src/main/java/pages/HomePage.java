 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utils.DriverFactory;

//import utils.DriverFactory;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();
    	//this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    // Page Factory elements
    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    WebElement backpackProduct;
    
    @FindBy(id = "shopping_cart_container")
    WebElement cart;
    
    public void show() {
    	System.out.println("This is home page");
        System.out.println("Home page is updated")

    }


   

    public void addProductToCart() {
        backpackProduct.click();
    }

    public void gotoCart() {
        cart.click();
    }
 }
