public class MyCircle<T> {
  //-----------------------------------------------------------------//
  //------------- !!Do not change the following lines!! -------------//
  //A Node is a single element int the ring
  class Node {
    T data_ = null;
    Node next_ = null;
    Node prev_ = null;

    Node(T obj, Node prv, Node nxt) {
      data_ = obj;
      prev_ = prv;
      next_ = nxt;
    }
  }

  //--- class members
  protected Node head_ = null;

  //--- class methods
  public   MyCircle() { head_ = null; }
  public T front()    { return head_.data_; }
  public String toString() {
    if (empty())
      return "[]";
    String rv = "[";
    Node node = head_;
    do {
      rv += node.data_.toString();
      if (node.next_ != head_)
        rv += ",";
      node = node.next_;
    } while(node != head_);
    rv += "]";
    return rv;
  }

  //-----------------------------------------------------------------//
  //---------------- !!Insert your solution below!! -----------------//
  public int size() {
	if(empty()){
		return 0;
	}
	else if(head_ == head_.next_){
		return 1;
	}
	else{
		int i=1;
		Node dummy = head_.next_;
		while(dummy != head_){
			dummy = dummy.next_;
			i++;
		}
		return i;
	}
  }

  //-----------------------------------------------------------------//
  public boolean empty() {
    	if(head_==null){
		return true;
	}
	return false;
  }

  //-----------------------------------------------------------------//
  public void push_back(T obj) {
  	
	if(empty()){
		head_ = new Node(obj , null, null);
		head_.next_ = head_;
		head_.prev_ = head_;
	}

	else{	
		Node dummy = new Node(obj, this.head_.prev_, this.head_);
		this.head_.prev_.next_ = dummy;
		this.head_.prev_ = dummy;
 	}
  }

  //-----------------------------------------------------------------//
  public void pop_front() {
  	head_.next_ = head_.next_.next_;
	head_.next_.prev_ = head_;
  }

  //-----------------------------------------------------------------//
  public static void main(String[] args) {
	MyCircle<Integer> test = new MyCircle<>();
	test.push_back(1);
	test.push_back(2);
	test.push_back(3);
	test.push_back(4);
	System.out.println(test.toString());
	System.out.println(""+test.size());
	test.pop_front();
	System.out.println(test.toString());
	System.out.println(""+test.size());
  }
}
