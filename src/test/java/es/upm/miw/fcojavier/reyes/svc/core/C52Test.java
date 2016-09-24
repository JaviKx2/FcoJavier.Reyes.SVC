package es.upm.miw.fcojavier.reyes.svc.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
	C52 c52;

	@Before
	public void init() {
	    c52 = new C52();
	}
	
	@Test
	public void testM1() {	
		assertEquals("mA", c52.mA());
	}
}
