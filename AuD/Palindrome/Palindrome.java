import java.util.*;

public class Palindrome{
	public static void main(String[] args){
		System.out.println(isPalindrome("nay"));
		System.out.println(isPalindrome("yay"));
	}

	public static boolean isPalindrome(String text){
		int i;
		String test="";
		Stack<Character> wort = new Stack<Character>();
		for(i=1; i<=text.length(); i++){
			wort.push(text.charAt(i));
		}
		for(i=1; i<=text.length(); i++){
			test=test+wort.pop();
		}
		return test==text;
	}
}
