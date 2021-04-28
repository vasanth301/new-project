package org.test.para;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Chumma {
	@Test
	private void tc1() {
		System.out.println("chumma"+Thread.currentThread().getId());
	}
	private void tc2() {
		System.out.println("test2"+Thread.currentThread().getId());
	}
	private void tc3() {
		System.out.println("test3"+Thread.currentThread().getId());
	}
}
