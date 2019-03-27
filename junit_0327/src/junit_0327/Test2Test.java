package junit_0327;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

public class Test2Test {
	private int input1,input2,except;
	private static Test2 t2;
	@BeforeClass
	public static void init() {
		t2 = new Test2();
	}
	public Test2Test(int input1,int input2,int except) {
		super();
		this.except = except;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data  = new Object[][] {
			{2,3,6},
			{4,5,20},
			
		};
		
		return Arrays.asList(data);
	}
	@Test
	public void testKakeru() {
		assertEquals(except, t2.kakeru(input1, input2));
	}

}
