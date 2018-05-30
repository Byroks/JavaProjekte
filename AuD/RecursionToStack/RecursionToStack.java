public class RecursionToStack {
  //-----------------------------------------------------------------//
  public static int whatStack(int n) {
	
	Stack<Integer> quer = new Stack<>();
	
	while(n>0){
		quer.push(n%10);
		n/=10;
	}
	
	while(!quer.is_empty()){
		n+=quer.pop();
	}
	
	return n;
  }

  //-----------------------------------------------------------------//
  public static void main(String args[]) {
	System.out.println(whatStack(123));	
	System.out.println(whatStack(456));
	System.out.println(whatStack(234));
	System.out.println(whatStack(124));
  }
}
