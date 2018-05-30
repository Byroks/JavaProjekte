public class list {
	public static void main(String[] args)
	{
		LinkedList hope = new LinkedList(1);
		hope.prepend(2);
		hope.prepend(3);
		hope.prepend(4);
		System.out.println(hope.size);
		//hope.printList();
		//hope.pop();
		//hope.printList();
		System.out.println(hope.get(1));
	}
}

class LinkedList {
	
			
	class ListElem {
	

		 public float value;
		public ListElem next = null;

	public ListElem(ListElem next, float value){
		this.value=value;
		this.next=next;
		
	}
	
	}
	
	

	 int size;
	public ListElem head = null;
		
	
	public LinkedList(float value)
	{	ListElem neu = new ListElem(null, value);
		this.head=neu;
		this.size=1;
		
	
	}
	
	
	public void prepend(float value)
	{	ListElem neuElem = new ListElem(head, value);
		
		this.head=neuElem;
		this.size++;
		return;
			
	}
	
	public float pop()
	{ 	float merken =head.value;
	 	this.head=this.head.next;
		this.size--;
		return merken;
	}
	
	
	public float get(int index)
	{ 	ListElem  pointer = this.head;
		//pointer = this.head;
	
		if (size<index || index <1){
			System.out.println("Fehler, der Index ist zu hoch für die Liste. Eorror:");return -1;
			
		}
		
		for (int i=0;i<index-1;i++){
			
				pointer = pointer.next;
								
			}		
	
		return pointer.value;
	}
	
	public void printList()
	{	ListElem  pointer = this.head; //new ListElem(head,0);
		//this.head = pointer;
		
		if (pointer.next==null){
			System.out.println (pointer.value);
		}
		
		else while (pointer.next!=null){
			System.out.println(pointer.value);
			pointer= pointer.next;
		}
		System.out.println(pointer.value);
	}
	
}


		