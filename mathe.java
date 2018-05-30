public class mathe{
	
	public static void main(String[] args){
		int n=1;
		float prev=1, now=0;

		while(prev!=now){
			prev=now;
			now+=(1.0/n);
			//System.out.println("prev: " +prev+ " now: "+now+ " n: " +n);
			n++;
		}
		System.out.println(""+now);
	}
}
