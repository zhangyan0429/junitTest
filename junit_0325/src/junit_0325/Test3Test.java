package junit_0325;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test3Test {
	private static Test3 t3;
	@BeforeClass
	public static void init() {
		t3=new Test3();
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testChufa() {
		thrown.expect(ArithmeticException.class);
		t3.chufa(1,0);
	}

}
