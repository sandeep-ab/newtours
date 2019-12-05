package com.newtours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	
	
	//<a href="mercurywelcome.php">Home</a>
		@FindBy(linkText="Home")
		WebElement home;
		
		public void home() {
			home.click();
		}
		
		//<a href="mercurysignon.php">SIGN-ON</a>
		@FindBy(linkText="SIGN-ON")
		WebElement signon;
		
		public void signon() {
			signon.click();
		}
		
			//<input maxlength="60" name="userName" size="20">
			//<input maxlength="60" name="password" size="20" type="password" aria-autocomplete="list">
			//<input type="image" name="login" value="Login" alt="Login" border="0" src="/images/forms/submit.gif" width="60" height="23">
			
		/*@FindBy(name="userName")
		WebElement username;
		public void username() {
			username.sendKeys("sandeep");
		}
		@FindBy(name="password")
		WebElement password;
		public void password() {
			password.sendKeys("9640722337");
		}
		@FindBy(name="login")
		WebElement submit;
		
		public void submit() {
			submit.click();
		}*/
		
		//<td class="mouseOut" width="77" height="33" align="center" onmouseout="changeStyle(this, 'mouseOut')" onmouseover="changeStyle(this, 'mouseOver')"><a href="mercuryregister.php">REGISTER</a></td>
		@FindBy(linkText="REGISTER")
	WebElement register;
		public void register() {
			register.click();
		}
		@FindBy(name="userName")
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(name="login")
		WebElement login;
		
		public void login(String UserName,String Password) {
		

			login.sendKeys(UserName,Password);
		}
		
		
		
		
		/*//<input maxlength="60" name="firstName" size="20">
		//register.click();
		@FindBy(name="firstName")
		WebElement firstname;
		public void firstname() {
		firstname.sendKeys("sandeep");
		
		}
		//<input maxlength="60" name="lastName" size="20">
		@FindBy(name="lastName")
		WebElement lastname;
		public void lastname() {
			lastname.sendKeys("d");
		}
			//<input maxlength="20" name="phone" size="15">
			@FindBy(name="phone")
			WebElement phone;
			public void phone() {
				phone.sendKeys("9640722337");
				
			}
			
		//<input name="userName" id="userName" size="35" maxlength="64">
			@FindBy(name="userName")
			WebElement email;
			public void email() {
				email.sendKeys("sandeepias337@gmail.com");
				
			}
			
			//<input maxlength="60" name="address1" size="40">
			@FindBy(name="address1")
			WebElement address;
			public void address() {
				address.sendKeys("hyderabad");
				
				
			}
			
			//<input maxlength="60" name="city" size="15">
			@FindBy(name="city")
			WebElement city;
			public void city() {
				city.sendKeys("hyderabad");
				
				
				
			}
			
			//<input maxlength="40" name="state">
			
			@FindBy(name="state")
			WebElement state;
			public void state() {
				state.sendKeys("telangana");
				
			}
			
			//<input maxlength="20" name="postalCode" size="15">
			@FindBy(name="postalCode")
	        WebElement postalcode;
			public void postalcode() {
				postalcode.sendKeys("500084");
				
			}
			//<select name="country" size="1">
			@FindBy(name="country")
			WebElement country;
			public void country() {
				country.sendKeys("india");
			}
			//<input name="email" id="email" size="20" maxlength="60">
			@FindBy(id="email")
			WebElement username;
			public void username() {
				username.sendKeys("sandeep");
			}
			//<input maxlength="60" name="password" size="20" type="password" aria-autocomplete="list">
			@FindBy(name="password")
			WebElement password;
			public void password() {
				password.sendKeys("9640722337");
				
			}
			//<input maxlength="60" name="confirmPassword" size="20" type="password">
			@FindBy(name="confirmPassword")
			WebElement confirmpassword;
			public void confirmpassword() {
				confirmpassword.sendKeys("9640722337");
				
			}
		//<input type="image" name="register" src="/images/forms/submit.gif" width="60" height="23" border="0">	
		@FindBy(name="register" )
	    WebElement submit;
		public void submit1() {
			submit.click();
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*//<a href="mercuryunderconst.php">SUPPORT</a>
		@FindBy(linkText="SUPPORT")
				WebElement support;
		public void support() {
			support.click();
		}
		//<img src="/images/forms/home.gif" width="118" height="23" border="0">
		//<img src="/images/forms/home.gif" width="118" height="23" border="0">
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")
		WebElement backtohome;
		public void backtohome() {
			backtohome.click();
		}
		//<a href="mercuryunderconst.php">CONTACT</a>
		@FindBy(linkText="CONTACT")
		WebElement contact;
		public void contact() {
			contact.click();
		}

		//<a href="mercuryreservation.php">Flights</a>
		@FindBy(name="Flights" )
	    WebElement flights;
		public void flights() {
			flights.click();
		}
		//<a href="mercuryunderconst.php">Hotels</a>
		@FindBy(name="Hotels" )
	    WebElement Hotels;
		public void Hotels() {
			Hotels.click();
		}
		///html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a
		
		@FindBy(xpath="/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a")
		WebElement carrentals;
		public void carrentals() {
			carrentals.click();
		}
		//<a href="mercurycruise.php">Cruises</a>
		@FindBy(name="Cruises" )
	    WebElement Cruises;
		public void Cruises() {
			Cruises.click();
		}
		//<a href="mercuryunderconst.php">Destinations</a>
		@FindBy(name="Destinations" )
	    WebElement Destinations;
		public void Destinations() {
			Destinations.click();
		}
		//<a href="mercuryunderconst.php">Vacations</a>
		@FindBy(name="Vacations" )
	    WebElement Vacations;
		public void Vacations() {
			Vacations.click();
		}*/
		
			
		}
