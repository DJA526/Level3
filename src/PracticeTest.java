import static org.junit.Assert.*;

import org.junit.Test;

public class PracticeTest {

	@Test
	public void testGetFirstThreeChars(){
		assertEquals("can", getFirstThreeChars("canalope"));
		assertEquals("app", getFirstThreeChars("application"));
		assertEquals("Sev", getFirstThreeChars("Seven"));
	}
	 
	@Test
	public void testAddUnlessSame(){
		assertEquals(7, addUnlessSame(3, 4));
		assertEquals(0, addUnlessSame(10, 10));
		assertEquals(25, addUnlessSame(5, 20));
		assertEquals(0, addUnlessSame(1, 1));
	}
	 
	@Test
	public void testReduceArrayByHalf(){
		double[] a1 = {10.0, 5.0, 24.0};
		double[] a2 = {5.0, 2.5, 12.0};
		
		assertArrayEquals(a2, reduceArrayByHalf(a1), 0.0001);
	}
	
	public String getFirstThreeChars(String s) {
		return s.substring(0, 3);
	}
	
	public int addUnlessSame(int x, int y) {
		int z = 0;
		if (x != y) {
			z = x + y;
		}
		return z;
	}
	
	public double[] reduceArrayByHalf(double[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i]/2;
		}
		return a;
	}

}
