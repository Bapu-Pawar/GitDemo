package StepDefinations;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import pages.OverviewPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import utils.DriverFactory;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    OverviewPage overviewPage = new OverviewPage();

    @Given("User launches the application")
    public void user_launches_the_application() {
        //DriverFactory.initDriver();
       // loginPage = new LoginPage();
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("Clicks on Login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() throws InterruptedException {
        //String expectedUrl = "https://www.saucedemo.com/inventory.html";
        //Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(), expectedUrl, "Login failed or redirected to wrong page.");
        //DriverFactory.quitDriver();
    	System.out.println("User is on homePage");
    	Thread.sleep(5000);
    }

    @Given("User is on homepage")
    public void User_is_on_homepage()   {
        //DriverFactory.initDriver();
         
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
       
        
    }

    @When("User clicks on add product to cart")
    public void user_add_product() {
        homePage.addProductToCart();
    }

    @And("Clicks on cart icon")
    public void user_click_on_cart_icon() {
        homePage.gotoCart();
    }

    @Then("Cart page should be displayed")
    public void cart_page_displayed() throws InterruptedException {
        System.out.println("Cart page displayed");
        Thread.sleep(5000);
       // DriverFactory.quitDriver();
    }
    
    @Given("User added product to cart")
    public void user_add_product_to_cart_page() {
    	loginPage.enterUsername("standard_user");
    	loginPage.enterPassword("secret_sauce");
    	loginPage.clickLogin();
    	homePage.addProductToCart();
    	homePage.gotoCart();
    }
    
    @When("User clicks on checkout button")
    public void user_click_checkout() {
    	cartPage.checkoutClick();
    }
    @Then("product added to checkout page")
    	public void checkout_page_diplayed() throws InterruptedException {
    		System.out.println("Checkout page displayed");
    		 Thread.sleep(5000);
    	}
    
    @Given("User is on checkout page")
    public void user_on_checkout_page() {
    	loginPage.enterUsername("standard_user");
    	loginPage.enterPassword("secret_sauce");
    	loginPage.clickLogin();
    	homePage.addProductToCart();
    	homePage.gotoCart();
    	cartPage.checkoutClick();
    }
    
    @When("User enter details")
    public void user_enter_details() {
    	checkoutPage.enterFirstname("Shital");
    	checkoutPage.enterLastname("Pawar");
    	checkoutPage.enterPostalcode("123456");
    	
    	
    }
    
    @And("click on continue button")
    public void user_click_on_continue() throws InterruptedException {
    	checkoutPage.clickContinue();
    	Thread.sleep(5000);
    	
    }
    
    @Then("Checkout overview page displayed")
    public void checkout_page_displayed() {
    	System.out.println("User is on checkout page");
    }
    
    @Given("User is on overview page")
    public void user_is_on_overviewPage() throws InterruptedException {
    	loginPage.enterUsername("standard_user");
    	loginPage.enterPassword("secret_sauce");
    	loginPage.clickLogin();
    	homePage.addProductToCart();
    	homePage.gotoCart();
    	cartPage.checkoutClick();
    	checkoutPage.enterFirstname("Shital");
    	checkoutPage.enterLastname("Pawar");
    	checkoutPage.enterPostalcode("123456");
    	checkoutPage.clickContinue();
    	Thread.sleep(5000);
    	
    }
    
    @When("User click on finish button")
    public void user_click_finiButton() {
    	overviewPage.clickFinish();
    	
    }
    @Then("order should get placed")
    public void orderPlaced() {
    	System.out.println("Order placed successfully");
    	
    }
    }
