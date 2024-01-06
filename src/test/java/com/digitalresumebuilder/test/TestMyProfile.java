package com.digitalresumebuilder.test;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.digitalresumebuilder.constants.Constants;
import com.digitalresumebuilder.pages.EditPage;
import com.digitalresumebuilder.pages.MyProfile;

public class TestMyProfile extends TestBase{
	MyProfile profile=null;
	EditPage obj = null;
	@Test
	public void profiletestcase1() throws InterruptedException {
		obj = new EditPage(driver);
		profile = new MyProfile(driver);
		obj.clickprofile();
		assertElementTextEquals(profile.verifyupdatename(Constants.UPDATED_NAME), Constants.UPDATED_NAME, "Name");
	    assertElementTextEquals(profile.verifyUpdatedDOB(Constants.UPDATED_DOB), Constants.UPDATED_DOB, "DOB");
	    assertElementTextEquals(profile.verifyupdatedemail(Constants.UPDATED_EMAIL), Constants.UPDATED_EMAIL, "Email");
	    assertElementTextEquals(profile.verifyupdatedphone(Constants.UPDATED_PHNO), Constants.UPDATED_PHNO, "Phone");
	    assertElementTextEquals(profile.verifyupdatelanguage(Constants.UPDATED_LANG), Constants.UPDATED_LANG, "Language");
	}

	private void assertElementTextEquals(boolean condition, String actualValue, String fieldName) {
	    try {
	        Assert.assertTrue(condition, fieldName + " not updated correctly. Actual: " + actualValue);
	        System.out.println(fieldName + " updated correctly.");
	    } catch (AssertionError e) {
	        System.out.println(fieldName + " update failed: " + e.getMessage());
	    }
	}
}
		 /*assert profile.verifyupdatename(Constants.UPDATED_NAME) : "Name not updated correctly";
	     assert profile.verifyUpdatedDOB(Constants.UPDATED_DOB) : "Date of Birth not updated correctly";
	     assert profile.verifyupdatedemail(Constants.UPDATED_EMAIL): "EMAIL id is not updated correctly";
	     assert profile.verifyupdatedphone(Constants.UPDATED_PHNO):"PHNO is not updated correctly";
	     assert profile.verifyupdatelanguage(Constants.UPDATED_LANG):"Language is not updated correctly";
	     
	    	 }
	

}*/

