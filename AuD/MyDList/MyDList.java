import aud.DList;

public class MyDList<T> extends DList<T> {
//-----------------------------------------------------------------//
  public MyDList() {
    super();
  }

//-----------------------------------------------------------------//
  public void append(MyDList<T> li) {
	int j = li.size();
	for(int i = 0; i<li.size(); ++i){
		insert(j, li.at(i));
		j++;
	}
  }

//-----------------------------------------------------------------//
  public void insert(int n, MyDList<T> li) {
	for(int i=0; i<li.size(); ++i){
		insert(n+i, li.at(i));
	}
  }

//-----------------------------------------------------------------//
  public static void main(String[] args) {
    // TODO: test your code with appropriate examples
  }
}
