package es.upm.miw.fcojavier.reyes.svc.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
	C32 c32;

	@Before
	public void init() {
	    c32 = new C32();
	}
	
	@Test
	public void testM1() {	
		assertEquals("mA", c32.mA());
	}
}
