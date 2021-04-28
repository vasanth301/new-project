package org.java;

import org.testng.annotations.Test;

public class Pom {
	@Test(groups="smoke")
	private void tc0() {
		System.out.println("method1");

	}
	@Test(groups="sanity")
	private void tc1() {
		System.out.println("method2");
	}
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("method3");
	}




}
