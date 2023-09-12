package com.hrms.TestScripts;
import org.testng.annotations.Test;

import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
public class TC002 {
	//public static void main(String args[]) {
		@Test
		 public void tc002() {
			//Test Steps
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.closeApplication();
	}

}
