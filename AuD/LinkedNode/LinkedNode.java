public class LinkedNode<T extends Comparable<T>> {
  private T data_ = null;
  private LinkedNode<T> next_ = null;

  public LinkedNode() {
	this(null);
  }

  // TODO: constructors
  public LinkedNode(T d){
	this(d, null);
  }

  public LinkedNode(T d, LinkedNode<T> n) {
	data_ = d;
	next_ = n;
  }

  private void insert(T d){
	LinkedNode<T> dummy = new LinkedNode<>(d, next_);
	this.next_ = dummy;
  }
  
  boolean getterNext(){
	if(next_==null){
		return false;
	}
	else{
		return true;
	}
  }

  T getterData(){
	return this.data_;
  }

  void search(T d){
	if((next_.data_.compareTo(d)<=0) && getterNext()){
		next_.search(d);
	}
	else{
		insert(d);
	}
  }

  // Provide String-representation for list beginning at `this` node.
  @Override
  public String toString() {
	String res = "";
	LinkedNode<T> iter = next_;
	while (iter != null) {
		res += "" + iter.data_;
		iter = iter.next_;
	}
	return res;
  }

  // You must provide a main() method!
  public static void main(String[] args) {
	LinkedNode<String> test = new LinkedNode<>();
	for (int i = 0; i < 3; ++i){
		test.insert(i+" ");
	}
	System.out.println(test.toString());
  }
}


