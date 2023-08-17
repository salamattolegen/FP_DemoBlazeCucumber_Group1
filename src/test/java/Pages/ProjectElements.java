package Pages;

import Utilities.BaseDriverDemoBlaze;
import Utilities.ProjectMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProjectElements extends ProjectMethods {


    public ProjectElements() {
        PageFactory.initElements(BaseDriverDemoBlaze.getDriver(), this);
    }


    @FindBy(css = "a[id='login2']")
    public WebElement loginLink;


    @FindBy(id = "loginusername")
    public WebElement userName;


    @FindBy(id = "loginpassword")
    public WebElement password;


    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;


    @FindBy(id = "nameofuser")
    public WebElement verification;


    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phones;


    @FindBy(xpath = "//a[text() ='Samsung galaxy s6']")
    public WebElement verifyPhone;


    @FindBy(xpath = "//a[text() ='Laptops']")
    public WebElement laptop;

    @FindBy(xpath = "//a[text() ='Sony vaio i5']")
    public WebElement verifyLaptop;

    @FindBy(xpath = "//a[text() ='Monitors']")
    public WebElement monitors;

    @FindBy(xpath = "//a[text() ='ASUS Full HD']")
    public WebElement verifyMonitor;

    @FindBy(xpath = "//a[@id ='logout2']")
    public WebElement logout;

    @FindBy(id = "login2")
    public WebElement logoutVerify;


    @FindBy(xpath = "//a[text() ='Add to cart']")
    public WebElement addToCart;


    @FindBy(id = "cartur")
    public WebElement goToCart;


    @FindBy(xpath = "//td[text()='360']")
    public WebElement price;


    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeOrder;


    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;


    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;


    @FindBy(id = "city")
    public WebElement city;


    @FindBy(id = "card")
    public WebElement creditCard;


    @FindBy(id = "month")
    public WebElement month;


    @FindBy(id = "year")
    public WebElement year;


    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement purchase;


    @FindBy(xpath = "//p[text()='Amount: 360 USD']")
    public WebElement amount;


    @FindBy(xpath = "//p[text()='Card Number: 12345678910']")
    public WebElement cardNumber;


    @FindBy(xpath = "//p[text()='Name: salamat']")
    public WebElement name2;


    @FindBy(xpath = "//p[text()='Date: 17/7/2023']")
    public WebElement date;


    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okkay;


    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    public WebElement home;


    @FindBy(xpath = "(//td[text()='ASUS Full HD'])[1]/../td[4]//a[text()='Delete']")
    public WebElement deleteMonitor;

    @FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped']//td[2])[1]")
    public WebElement asusInCart;

    @FindBy(css = "tr[class='success']")
    public List<WebElement> productsInCart;


    @FindBy(xpath = "//*[text()='ASUS Full HD']")
    public WebElement monitorAsus;


    @FindBy(css = "button[id='next2']")
    public WebElement nextButton;


    @FindBy(xpath = "//a[text()='Apple monitor 24']")
    public WebElement appleMonitor24;


    @FindBy(xpath = "//h3[@id='totalp']")
    public WebElement totalPrice;


}

