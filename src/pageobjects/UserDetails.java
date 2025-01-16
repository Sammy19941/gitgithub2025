package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="UserDetails"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class UserDetails {

	@TextType()
	@FindByLabel(label = "Company Name")
	public WebElement companyName;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Company Name')]/../../dd/span/span")
	public WebElement companyName1;
			
}
