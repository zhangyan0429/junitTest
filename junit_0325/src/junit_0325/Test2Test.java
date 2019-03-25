package junit_0325;

import static org.junit.Assert.*;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Test2Test {
    private int input;
    private boolean isEven;
    private static Test2 t2;
    @BeforeClass
    public static void init() {
    	t2 = new Test2();
    }
    // Step 3: parameterized constructor
    public Test2Test(int input, boolean isEven) {
        super();
        this.input = input;
        this.isEven = isEven;
    }
 
    // Step 4: data set of variable values
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 2, true },
                { 5, false },
                { 10, true }
        };
        return Arrays.asList(data);
    }
 
    @Test
    public void testIsEven() {
        
        
        // Step 5: use variables in test code
        
        assertEquals(isEven, t2.isEven(input));
    }

}
