package org.test.para;

import org.testng.annotations.Test;

public class Afcat {
	@Test
	private void tc11() {
		System.out.println("test11"+Thread.currentThread().getId());


		
	}	
	private void tc12() {
		System.out.println("test12"+Thread.currentThread().getId());
	}
	private void tc13() {
		System.out.println("test13"+Thread.currentThread().getId());
	}
}