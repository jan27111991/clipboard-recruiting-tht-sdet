package amazon.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonOR {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[text()='shop by category']")
	public WebElement shopByCategory;
	
	@FindBy(xpath = "//a[@data-csa-c-slot-id=\"HamburgerMenuDesktop\"]")
	public WebElement HamburgerMenuDesktop;

	@FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
	public WebElement sideMenu;


	@FindBy(xpath = "//a[text()='Televisions']")
	public WebElement television;

	@FindBy(xpath = "//span[text()='Brands']")
	public WebElement brands;

	@FindBy(xpath = "//span[text()='Samsung']")
	public WebElement samsung;

	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
	public WebElement dropDown;

	@FindBy(xpath = "//a[text()='Price: High to Low']")
	public WebElement hightoLowdropDownValue;
	
	@FindBy(xpath = "//div[@data-cel-widget=\"search_result_2\"]//a")
	public WebElement secondHighest;
	
	@FindBy(xpath = " //h1[text()=' About this item ']")
	public WebElement aboutItem;
	
	@FindBy(xpath = "//h1[text()=' About this item ']/following-sibling::ul")
	public WebElement itemDescription;
	
	
	public AmazonOR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
