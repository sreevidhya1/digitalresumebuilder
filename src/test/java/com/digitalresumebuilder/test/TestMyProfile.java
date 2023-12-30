package com.digitalresumebuilder.test;
import org.testng.annotations.Test;

import com.digitalresumebuilder.constants.Constants;
import com.digitalresumebuilder.pages.EditPage;
import com.digitalresumebuilder.pages.MyProfile;

public class TestMyProfile extends TestProfileBase{
	MyProfile profile=null;
	EditPage obj = null;
	@Test
	public void profiletestcase1() {
		obj.clickprofile();
		 assert profile.verifyupdatename(Constants.UPDATED_NAME) : "Name not updated correctly";
	     assert profile.verifyUpdatedDOB(Constants.UPDATED_DOB) : "Date of Birth not updated correctly";
	     assert profile.verifyupdatedemail(Constants.UPDATED_EMAIL): "EMAIL id is not updated correctly";
	     assert profile.verifyupdatedphone(Constants.UPDATED_PHNO):"PHNO is not updated correctly";
	     assert profile.verifyupdatelanguage(Constants.UPDATED_LANG):"Language is not updated correctly";
	     
	    	 }
	

}

