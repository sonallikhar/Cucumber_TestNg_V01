package stepdefinitions;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import cucumber.api.java.en.*;
import pageObjectpackage.CartPage;
import pageObjectpackage.CreateAccountPage;
import pageObjectpackage.HomePage;
import pageObjectpackage.LoginPage;
import pageObjectpackage.MobilePage;
import pageObjectpackage.ProfilePage;
import utilitypackage.TestBase;


public class Steps extends TestBase {
	LoginPage lp;
	HomePage hp;
	MobilePage mp;
	ProfilePage pp;
	CartPage cp;
	CreateAccountPage cap;

	@Given("^User Launch browser$")
	public void user_Launch_browser() throws Throwable {
		logger.info("******User Launch browser *******");
		initialization();
	}

	@Then("^Page Title should be \"(.*?)\"$")
	public void page_Title_should_be(String title) throws Throwable {
		logger.info("******Validate Page Title *******");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    hp=new HomePage(driver);
	    Assert.assertEquals(hp.verifyHomePageTitle(), title);
	    failed(hp.verifyHomePageTitle(), title);
	    
	}

	@Then("^User Click on Signin button$")
	public void user_Click_on_Signin_button() throws Throwable {
		logger.info("******User Click on Signin button *******");
		hp=new HomePage(driver);
		hp.clickyouraccount();
	  
	}

	@Then("^User enters valid login userid$")
	public void user_enters_valid_login_userid() throws Throwable {
		logger.info("******User enters valid login userid *******");
		lp= new LoginPage(driver);
		lp.enterUserid(prop.getProperty("username"));
	    
	}

	@Then("^User Click on Continue$")
	public void user_Click_on_Continue() throws Throwable {
		logger.info("******User Click on Continue *******");
		lp= new LoginPage(driver);
		lp.clickcontinue();
	}

	@Then("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		logger.info("******User enters valid password *******");
		lp= new LoginPage(driver);
		lp.enterPassword(prop.getProperty("password"));
	}

	@Then("^User Click on login$")
	public void user_Click_on_login() throws Throwable {
		logger.info("******User Click on login *******");
		lp= new LoginPage(driver);
		lp.clickLogin();
	}

	@Then("^validate logged in user$")
	public void validate_logged_in_user() throws Throwable {
		logger.info("******validate logged in user *******");
		hp=new HomePage(driver);
		Assert.assertEquals(hp.verifyusername(), true);
	}

	@Then("^User enter value to Searchbox as \"(.*?)\"$")
	public void user_enter_value_to_Searchbox_as(String mobilesearch) throws Throwable {
		logger.info("******User enter value to Searchbox*******");
		hp=new HomePage(driver);
		hp.sendtexttosearch(mobilesearch);
	}

	@Then("^User Click on Search button$")
	public void user_Click_on_Search_button() throws Throwable {
		logger.info("******User Click on Search button*******");
		hp=new HomePage(driver);
		hp.clickonsearch();
	}

	@When("^User Click on Samsung Galaxy M(\\d+) \\(Ocean Blue, (\\d+)GB RAM, (\\d+)GB Storage\\)$")
	public void user_Click_on_Samsung_Galaxy_M_Ocean_Blue_GB_RAM_GB_Storage(int arg1, int arg2, int arg3) throws Throwable {
		logger.info("******User_Click_on_Samsung_Galaxy_M_Ocean_Blue_GB_RAM_GB_Storage*******");
		mp=new MobilePage(driver);
		mp.clickonm31mobile();
	}

	@Then("^User on new window with title should be \"(.*?)\"$")
	public void user_on_new_window_with_title_should_be(String title) throws Throwable {
		logger.info("******User_Click_on_Samsung_Galaxy_M_Ocean_Blue_GB_RAM_GB_Storage*******");
		mp=new MobilePage(driver);
		Assert.assertEquals(mp.switchwindowtobuy(), title);
		failed(mp.switchwindowtobuy(), title);
	}

	@Then("^User Click on Buy now button$")
	public void user_Click_on_Buy_now_button() throws Throwable {
		logger.info("******User Click on Buy now button*******");
		mp=new MobilePage(driver);
		mp.clickbuynow();
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		logger.info("******User Close Browser*******");
		Thread.sleep(2000);
	    driver.quit();
	}
	@Then("^User Click on Create your Amazon account$")
	public void user_Click_on_Create_your_Amazon_account() throws Throwable {
		logger.info("******User Click on Create your Amazon account*******");
		lp=new LoginPage(driver);
		lp.clickcreateaccount();
		
	}

	@Then("^User Enter username as \"(.*?)\"$")
	public void user_Enter_username_as(String id) throws Throwable {
		logger.info("******User Enter username*******");
		cap=new CreateAccountPage(driver);
		cap.entercustname(id);	
	}
	@Then("^User Enter Mobile number as \"(.*?)\"$")
	public void user_Enter_Mobile_number_as(String number) throws Throwable {
		logger.info("******User Enter Mobile number*******");
		cap=new CreateAccountPage(driver);
		cap.entermonum(number);	
	}

	@Then("^User Enter Email as \"(.*?)\"$")
	public void user_Enter_Email_as(String emailid) throws Throwable {
		logger.info("******User Enter Email*******");
		cap=new CreateAccountPage(driver);
		cap.enteremail(emailid);
	}

	@Then("^User Enter Password as \"(.*?)\"$")
	public void user_Enter_Password_as(String password) throws Throwable {
		logger.info("******User Enter Password*******");
		lp=new LoginPage(driver);
		lp.enterPassword(password);
	}

	@Then("^User enters valid login input as \"(.*?)\"$")
	public void user_enters_valid_login_input_as(String id) throws Throwable {
		logger.info("******User enters valid login input*******");
		lp=new LoginPage(driver);
		lp.enterUserid(id);
	}

	@Then("^User enters Password as \"(.*?)\"$")
	public void user_enters_Password_as(String password) throws Throwable {
		logger.info("******User Enter Password*******");
		lp=new LoginPage(driver);
		lp.enterPassword(password);
	}

	@Then("^User Click on Logout$")
	public void user_Click_on_Logout() throws Throwable {
		logger.info("******User Click on Logout*******");
		hp=new HomePage(driver);
		hp.clicklogout();
	}

	@Then("^Error message should be displayed as \"(.*?)\"$")
	public void error_message_should_be_displayed_as(String errormsg) throws Throwable {
		logger.info("******Error message should be displayed*******");
		lp=new LoginPage(driver);
		Assert.assertEquals(lp.ErrormsgUserid(), errormsg);
		failed(lp.ErrormsgUserid(), errormsg);
	}

	@Then("^Error message for password displayed as \"(.*?)\"$")
	public void error_message_for_password_displayed_as(String errormsg) throws Throwable {
		logger.info("******Error message for password displayed*******");
		lp=new LoginPage(driver);
		Assert.assertEquals(lp.ErrormsgPass(), errormsg);
		failed(lp.ErrormsgPass(), errormsg);
		System.out.println(lp.ErrormsgPass()+"----------"+ errormsg);
		
	}

	@Then("^User enters invalid login userid$")
	public void user_enters_invalid_login_userid() throws Throwable {
		logger.info("******User enters invalid login userid*******");
		lp=new LoginPage(driver);
		lp.enterUserid("Testing");
		
	}

	@Then("^Error message for not registered userid should be displayed as \"(.*?)\"$")
	public void error_message_for_not_registered_userid_should_be_displayed_as(String errormsg) throws Throwable {
		logger.info("******Error message for not registered userid*******");
		lp=new LoginPage(driver);
		Assert.assertEquals(lp.Errormsg(), errormsg);
		failed(lp.Errormsg(), errormsg);
	}

	@Then("^User enters invalid login password$")
	public void user_enters_invalid_login_password() throws Throwable {
		logger.info("******User enters invalid login password*******");
		lp=new LoginPage(driver);
		lp.enterPassword("Testing");
	}

	@Then("^Error message getting as your password is incorrect$")
	public void error_message_getting_as_your_password_is_incorrect() throws Throwable {
		logger.info("******Error message getting as your password is incorrect*******");
		lp=new LoginPage(driver);
		Assert.assertEquals(lp.ErrorPassword(), "Your password is incorrect");
		failed(lp.ErrorPassword(), "Your password is incorrect");
	}

	@Then("^User Click on Mobile Link$")
	public void user_Click_on_Mobile_Link() throws Throwable {
		logger.info("******User Click on Mobile Link*******");
		hp=new HomePage(driver);
		hp.clickonmobilelink();
		Thread.sleep(2000);
	}

	@Then("^User Select Samsung brand$")
	public void user_Select_Samsung_brand() throws Throwable {
		logger.info("******User Select Samsung brand*******");
		hp=new HomePage(driver);
		hp.clickonsamsung();
	}

	@Then("^User Get Result as \"(.*?)\"$")
	public void user_Get_Result_as(String brand) throws Throwable {
		logger.info("******User Get Result*******");
		hp=new HomePage(driver);
		Assert.assertEquals(hp.gettextsamsung(), brand);
		failed(hp.gettextsamsung(), brand);	
	}

	@Then("^User Select Price Under (\\d+)$")
	public void user_Select_Price_Under(int arg1) throws Throwable {
		logger.info("******User Select Price Under Thausand*******");
		hp=new HomePage(driver);
		hp.priceunder1000();
	}

	@Then("^User Get Filter Result as \"(.*?)\"$")
	public void user_Get_Filter_Result_as(String message) throws Throwable {
		logger.info("******User Get Filter Result*******");
		hp=new HomePage(driver);
		Assert.assertEquals(hp.pricegettext(), message);
		failed(hp.pricegettext(), message);
	}

	@Then("^User Select Price between thausand to five thausand$")
	public void user_Select_Price_between_thausand_to_five_thausand() throws Throwable {
		logger.info("******User Select Price between thausand to five thausand*******");
		hp=new HomePage(driver);
		hp.pricethtofiveth();
	}


	@Then("^User Select Price Over tewenty thausand$")
	public void user_Select_Price_Over_tewenty_thausand() throws Throwable {
		logger.info("******User Select Price Over tewenty thausand*******");
		hp=new HomePage(driver);
		hp.priceabovetwentyth();
	}

	@When("^User click on Your Account$")
	public void user_click_on_Your_Account() throws Throwable {
		logger.info("******User click on Your Account*******");
		hp=new HomePage(driver);
		hp.clickyouraccount();
	}

	@When("^User Click on Login and Security$")
	public void user_Click_on_Login_and_Security() throws Throwable {
		logger.info("******User Click on Login and Security*******");
		pp=new ProfilePage(driver);
		pp.clickonloginsecurity();
	}

	@Then("^User Click to Edit Name$")
	public void user_Click_to_Edit_Name() throws Throwable {
		logger.info("******User Click to Edit Name*******");
		pp=new ProfilePage(driver);
		pp.clickeditname();
	}

	@Then("^User enter new name as \"(.*?)\"$")
	public void user_enter_new_name_as(String name) throws Throwable {
		logger.info("******User enter new name*******");
		pp=new ProfilePage(driver);
		pp.editcustname(name);
	}

	@Then("^User Click on Save Changes button$")
	public void user_Click_on_Save_Changes_button() throws Throwable {
		logger.info("******User Click on Save Changes button*******");
		pp=new ProfilePage(driver);
		pp.clicksavechanges();
	}

	@Then("^User should get sucessful message as \"(.*?)\"$")
	public void user_should_get_sucessful_message_as(String msg) throws Throwable {
		logger.info("******User should get sucessful message*******");
		pp=new ProfilePage(driver);
		Assert.assertEquals(pp.successmsg(), msg);
		failed(pp.successmsg(), msg);
		
	}
	@Then("^Get all mobile phones having four rating add details in excle$")
	public void get_all_mobile_phones_having_four_rating_add_details_in_excle() throws Throwable {
		logger.info("******Get all mobile phones having four rating add details in excle*******");
		mp=new MobilePage(driver);
		mp.mobilephonedetails();
	}

	@Then("^User added ten phones to cart$")
	public void user_added_ten_phones_to_cart() throws Throwable {
		logger.info("******User added ten phones to cart*******");
		mp=new MobilePage(driver);
		mp.addtocarttenmobile();
	}

	@Then("^User click on Cart$")
	public void user_click_on_Cart() throws Throwable {
		logger.info("******User click on Cart*******");
		hp=new HomePage(driver);
		hp.clickoncart();
	}

	@Then("^User Added mobile on first two mobile phones$")
	public void user_Added_mobile_on_first_two_mobile_phones() throws Throwable {
		logger.info("******User Added mobile on first two mobile phones*******");
		cp=new CartPage(driver);
		cp.quantityfirst();
		cp.quantitysecound();
	}

	@Then("^User Deleted remaining eight mobile phones$")
	public void user_Deleted_remaining_eight_mobile_phones() throws Throwable {
		logger.info("******User Deleted remaining eight mobile phones*******");
		cp=new CartPage(driver);
		cp.deleteeight();
	}
	
	@Then("^User Click on Add to Wish List$")
	public void user_Click_on_Add_to_Wish_List() throws Throwable {
		logger.info("******User Click on Add to Wish List*******");
		mp=new MobilePage(driver);
		mp.clickwishlist();
	}

	@Then("^User Click view Wish List$")
	public void user_Click_view_Wish_List() throws Throwable {
		logger.info("******User Click view Wish List*******");
		mp=new MobilePage(driver);
		mp.clickviewwishlist();
	}

	@Then("^User Click on Add to Cart$")
	public void user_Click_on_Add_to_Cart() throws Throwable {
		logger.info("******User Click on Add to Cart*******");
		mp=new MobilePage(driver);
		mp.clickaddtocart();
	}

	@Then("^User get message as \"(.*?)\"$")
	public void user_get_message_as(String msg) throws Throwable {
		logger.info("******User Click on Add to Cart*******");
		mp=new MobilePage(driver);
		Assert.assertEquals(mp.addtocartmsg(), msg);
		failed(mp.addtocartmsg(), msg);
	}

	@Then("^User Validate Samsung Galaxy A(\\d+) \\(Ocean Blue, (\\d+)GB RAM, (\\d+)GB Storage\\)with No Cost EMI/Additional Exchange Offers displayed into cart$")
	public void user_Validate_Samsung_Galaxy_M_Ocean_Blue_GB_RAM_GB_Storage_displayed_into_cart(int arg1, int arg2, int arg3) throws Throwable {
		logger.info("******User Validate Samsung Galaxy M31 (Ocean Blue, 6GB RAM, 64GB Storage)*******");
		mp=new MobilePage(driver);
		Assert.assertEquals(mp.itemtocart(), "Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers");
		failed(mp.itemtocart(), "Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers");
	}

}
