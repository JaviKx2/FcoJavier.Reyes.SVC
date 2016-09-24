package es.upm.miw.fcojavier.reyes.svc.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
	C21 c21;

	@Before
	public void init() {
		c21 = new C21();
	}
	
	@Test
	public void testM1() {	
		assertEquals("m1", c21.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", c21.m2());
	}
	
	@Test
    public void testM3() {
        assertEquals("m3", c21.m3());
    }

}
