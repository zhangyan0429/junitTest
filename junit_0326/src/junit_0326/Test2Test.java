package junit_0326;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//step1
@RunWith(Parameterized.class)
public class Test2Test {
	//step2
	private  int input1,input2,except;
	private static Test2 t2;
	//step3
	@BeforeClass
	public static void init() {
		t2 = new Test2();
	}
	//step4
	
	
	public  Test2Test(int input1,int input2,int except) {
		super();
		this.except = except;
		this.input1 = input1;
		this.input2 = input2;
		
	}
	//step5
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {{2,3,6},{3,3,9}};
		return Arrays.asList(data);
	}
	
	
	@Test
	public void testKakeru() {
		assertEquals(except,t2.kakeru(input1, input2));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	
	@Test
	public void testChu() {
		thrown.expect(ArithmeticException.class);
		assertEquals(5,t2.chu(10, 0));
	}

}
