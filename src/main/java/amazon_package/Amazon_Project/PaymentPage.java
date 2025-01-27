package amazon_package.Amazon_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceedtobuy;

	@FindBy(xpath = "(//a[@class='a-link-normal expand-panel-button celwidget'])[1]")
	WebElement changeaddress_button;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-radio'])[1]")
	WebElement deliveryaddress_radiobutton;

	@FindBy(xpath = "(//input[@class='a-button-input'])[2]")
	WebElement usethisaddress_button;

	@FindBy(xpath = "(//a[@class='a-link-normal expand-panel-button celwidget'])[2]")
	WebElement changepaymentmethod_button;

	@FindBy(xpath = "(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
	WebElement cod;

	@FindBy(xpath = "//span[@id='checkout-secondary-continue-button-id']")
	WebElement usethispaymentmethod;

	@FindBy(id = "placeOrder")
	WebElement placeyourorder_button;

	@FindBy(xpath = "//div[@class='a-box-inner a-alert-container']")
	WebElement thankyou_button;

	public void proceedtobuy() {
		proceedtobuy.click();
	}

	public void usethisaddress_button() {
		wait.until(ExpectedConditions.elementToBeClickable(usethisaddress_button));
		usethisaddress_button.click();

	}

	public void changepaymentmethod() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(changepaymentmethod_button));
		changepaymentmethod_button.click();
//		System.out.println("changepaymentmethod clicked");
	}
	public void cod() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(cod));
		cod.click();
		System.out.println("cod selected");
	}

	public void usethispaymentmethod() {
		wait.until(ExpectedConditions.elementToBeClickable(usethispaymentmethod));
		usethispaymentmethod.click();
		System.out.println("used payment method");
	}

	public void placeyourorder() throws InterruptedException {
		Thread.sleep(3000);
		placeyourorder_button.click();
	}

	public void thankyou() {
		thankyou_button.click();
	}
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
