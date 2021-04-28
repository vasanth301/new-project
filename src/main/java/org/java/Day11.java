package org.java;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Day11 implements IRetryAnalyzer {
	int min=0,max=10;
	public boolean retry(ITestResult arg0) {

		return false;
	}


}
