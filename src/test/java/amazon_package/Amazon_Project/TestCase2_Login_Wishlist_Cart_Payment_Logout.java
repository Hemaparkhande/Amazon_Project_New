package amazon_package.Amazon_Project;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
//Login to amazon->search a product->add it to wishlist->add it to cart->Make a paymnet using COD->logout			
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase2_Login_Wishlist_Cart_Payment_Logout extends LaunchQuit
{
	@Test
	public void Login_Wishlist_Cart_Payment_Logout() throws InterruptedException
	{	
		HomePage homepage = new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.user();
		loginpage.cntbutton();
		loginpage.password();
		loginpage.signinbutton();
		
		homepage.search(driver);
		SearchResultPage searchresultpage = new SearchResultPage(driver);
		searchresultpage.searchresultproduct1();
		
		Product1Page product1page = new Product1Page(driver);
		product1page.addtocart(driver);
		product1page.gotocart_button();
		
		
		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.proceedtobuy();
		paymentpage.usethisaddress_button();
		paymentpage.cod();
		Thread.sleep(3000);
		paymentpage.usethispaymentmethod();
//		paymentpage.placeyourorder();
//		paymentpage.thankyou();
		
	
	homepage.accountandlist(driver);
	homepage.logout();
}
}