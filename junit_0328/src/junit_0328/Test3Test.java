package junit_0328;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

import com.sun.org.apache.xml.internal.dtm.ref.ExpandedNameTable;

public class Test3Test {
	private static Test3 t3;
	@BeforeClass
	public static void init() {
		t3 = new Test3();
	}
@Rule
public ExpectedException thrown = ExpectedException().none();
	@Test
	public void testChu() {
		thrown.expect(ArithmeticException.class);
		assertEquals(2,t3.chu(10, 0));
	}
	private ExpectedException ExpectedException() {
		// TODO Auto-generated method stub
		return null;
	}

}
