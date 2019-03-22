package junit_0322;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test2Test {
	private static Test2 t2;
	@BeforeClass
	public static void init() {
		t2 = new Test2();
		
	}
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testChu()  {
		
		thrown.expect(ArithmeticException.class);
		t2.chu(1, 0);
	}

}
