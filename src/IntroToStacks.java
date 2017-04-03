import java.util.Stack;

public class IntroToStacks {
	
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		myStack.push("apple");
		myStack.push("banana");
		myStack.push("orange");
		myStack.push("peach");
		myStack.push("kiwi");
		for (int i = 0; i < 5; i++) {
			System.out.println(myStack.pop());
		}
		
		System.out.println(reverseString("onomatopoeia"));
	}
	
	public static String reverseString(String s){
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		String reverseString = "";
		for (int i = 0; i < s.length(); i++) {
			reverseString = reverseString + stack.pop();
		}
		return reverseString;
	}

}
