import static org.junit.Assert.*;

import org.junit.Test;

public class MoreandMoreTests {
	
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	
	String multiply(int x, int y) {
		return x + " x " + y + " = " + x*y;
				
	}

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	
	boolean isPrime(int x) {
		boolean b = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				b = false;
			}
		}
		return b;
	}

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	
	boolean isSquare(int x) {
		boolean b = false;
		for (int i = 1; i <= x; i++) {
			if (i*i == x) {
				b = true;
			}
		}
		return b;
	}

	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }
	
	boolean isCube(int x){
		boolean b = false;
		for (int i = 1; i <= x; i++) {
			if (i*i*i == x) {
				b = true;
			}
		}
		return b;
	}

}


//Copyright © 2017 by Delara Aryan