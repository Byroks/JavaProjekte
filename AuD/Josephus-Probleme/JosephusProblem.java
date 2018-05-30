public class JosephusProblem {

  // Solve the Josephus problem for a list of persons and a number k
  // of persons to be skipped. The solution should "simulate" the
  // counting-out and return a queue that contains all persons in the
  // order they were counted out.
 
  public static Queue<String> solve(String[] persons, int k) {
	Queue Abgez= new Queue(persons.length);
	while(k!=k+persons.length){
		for(int i=0; i<13; i++){
			if(i==(k-1)){
				Abgez.enqueue(persons[i]);
				System.out.println(""+i);
			}
		}
	k++;
	}
	return Abgez;
  }

  public static void main(String[] args) {
	String persons[] = new String[13];
	for(int i=0; i<13; i++){
		persons[i]=""+(i+1);
	}
	System.out.println(solve(persons, 7).toString());
  }
}
