import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void test() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}
	
	boolean doBracketsMatch(String s){
		boolean b = true;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{') {
				stack.push(c);
			} else if (c == '}') {
				if (stack.empty() == false) {
					char c2 = stack.pop();
					if (c2 != '{') {
						b = false;
					}
				} else {
					b = false;
				}
			}
		}
		if (stack.isEmpty() == false) {
			b = false;
		}
		return b;
		
	}

}
