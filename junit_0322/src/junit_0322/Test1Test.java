package junit_0322;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class Test1Test {
	private static Test1 t1;
	int except,input1,input2;
	
	@Parameters
	public static Collection<Object[]> initTestData(){
		return Arrays.asList(
				new Object[][] {{3,1,2},{5,2,3}}
				);
	}
	
	
	@BeforeClass
	public static void init() {
		t1 = new Test1();
	}
	
	

	@Test
	public void testTotal() {
		assertEquals(except,t1.total(input1, input2));
	}

}
