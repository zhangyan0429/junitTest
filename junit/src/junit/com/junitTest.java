package junit.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitTest {
    private static junit j;
    
    @BeforeClass
    public static void  init(){
    	j = new junit();
    	
    }
	@Test
	public void testAdd() {
		assertEquals(3, j.add(1, 2));
	}
	@Test
	public void testXiaoyu() {
		assertTrue(j.xiaoyu(-1));
	}
	@Test
	public void testGetString() {
		assertNull(null,j.getString("hello"));
		
	}
}
