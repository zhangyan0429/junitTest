package junit_0325;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test1Test {
	private static Test1 t1;
	
	@BeforeClass
	public static void init() {
		t1=new Test1();
		
	}
	@Test
	public void testAdd() {
		assertEquals(3,t1.add(1, 2));
		assertEquals(7,t1.add(1, 6));
		assertEquals(5,t1.add(1, 4));
		assertEquals(4,t1.add(1, 3));
	}
	
	
	@Test
	public void testSub() {
		assertEquals(5,t1.sub(10,5));
		
	}

}
