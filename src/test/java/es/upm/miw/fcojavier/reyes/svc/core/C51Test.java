package es.upm.miw.fcojavier.reyes.svc.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
	C51 c51;

	@Before
	public void init() {
	    c51 = new C51();
	}
	
	@Test
	public void testM1() {	
		assertEquals("m1", c51.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", c51.m2());
	}

}
