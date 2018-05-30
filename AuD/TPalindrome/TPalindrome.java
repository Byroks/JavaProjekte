import aud.Stack;

public class TPalindrome{
	public static boolean isTPalindrome(String text){
		int j=text.length()-1, i=0;
		String deeper="";		
		char[] c=text.toCharArray();
		Stack test = new Stack();

		while(i<c.length && (c[i]!='(' && i<=j)){
			while(c[j]!=')' && i<j){
				j--;
			}
			i++;
		}

		if(i<j){
			int n, m=j;
			for(n=i+1; n<m;++n){
			deeper=deeper+text.charAt(n);
			}
			if(isTPalindrome(deeper)){
				deeper="("+deeper+")";
				text=text.replace(deeper, "");
			}
			else{
				return false;
			}
		}
		deeper="";
		c=text.toCharArray();
		for(i=0; i<text.length(); ++i){
			test.push(c[i]);
		}
		
		while(!test.is_empty()){
			deeper=deeper+test.pop();
		}

		return (deeper.equals(text));
	}

	public static void main(String[] ARGS){
		System.out.println(isTPalindrome("aba"));
		System.out.println(isTPalindrome("ab(a)(a)ba"));
		System.out.println(isTPalindrome("ab(ab)ba"));	
	}
}
