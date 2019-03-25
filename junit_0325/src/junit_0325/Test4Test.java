package junit_0325;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Test4Test {
//step1
	private int input1,input2,except;
	private static Test4 t4;
//step2
	@BeforeClass
	public static void init() {
		t4 = new Test4();
	}
//step3
	public Test4Test(int input1,int input2,int except) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.except = except;
		
	}
//step4
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {
			{2,3,6},
			{4,5,20}
		};
		return Arrays.asList(data);
	}
	@Test
	public void testKakeru() {
		assertEquals(except,t4.kakeru(input1, input2));
	}

}
