package junit_0329;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test1Test {
	private static Test1 t1;
	@BeforeClass
	public static void init() {
		t1 = new Test1() ;
	}
	@Test
	public void testAdd() {
		assertEquals(5,t1.add(2, 3));
	}

}
