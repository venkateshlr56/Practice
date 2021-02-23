package org.locators;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPojo extends LibGlobal {
	
	@FindBys({
			@FindBy(id="email"),
			@FindBy(name="email")
			})
	
	private WebElement txtEmail;
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(xpath="//button[name='button]'")
	})
	
	private WebElement txtPass;
	
	@FindBy(id="u_0_b")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	

}
