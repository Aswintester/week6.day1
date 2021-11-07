package Steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	//public void LaunchBrowser() {
		
	//}
	//@Given ("Load the {string}")
	//public void LaunchURL(String url) {
	//	driver.get(url);
	//}
	@Given ("Enter username as {string}")
	public void UserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given ("Enter password as {string}")
	public void Password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When ("click on login button")
	public void ClickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then ("Homepage should be displayed")
	public void TitleVerification() {
		String TitlePage = driver.getTitle();
		if (TitlePage.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.print("HomePage is displayed");
		}
	}
	
	@But ("Error should be displayed")
	public void errorMessgae(){
		System.out.print("Page error");
	}
	
	@When("click on CRMSFA link")
	public void click_on_crm_sfa_link() {
	    driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	}
	
	@Then ("Leads HomePage should be opened")
	public void LeadsPageTitle(){
		String TitlePage = driver.getTitle();
		if (TitlePage.equals("My Home | opentaps CRM")) {
			System.out.print("Lead Home Page is displayed");
		}
	}

	@When ("click on Create Leads")
	public void CreatLeads() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}
	
	@Then ("CreateLead Page should be opened")
	public void CreateLeadPage() {
		String TitlePage = driver.getTitle();
		if (TitlePage.equals("Create Lead | opentaps CRM")) {
			System.out.print("Create Lead Home Page is displayed");
	}

}
}
