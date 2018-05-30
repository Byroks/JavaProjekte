class BinarySearchTree<T extends Comparable<T>>{

    T inhalt = null;
    BinarySearchTree left = null;
    BinarySearchTree right = null;

    public BinarySearchTree(T value){
        this.inhalt = value;
    }

    public void insert(T value){
	if(this.inhalt.compareTo(value)>=0){
		if(left != null){
			left.insert(value);
		}
		else{
			left = new BinarySearchTree(value);
		}
	}
	else{
		if(right != null){
			right.insert(value);
		}
		else{
			right = new BinarySearchTree(value);
		}
    	}
    }


    public boolean search(T value){

	boolean check = false;	

	if(!this.inhalt.equals(value)){
		System.out.println("Inhalt: " + this.inhalt);
		if(this.inhalt.compareTo(value)>0){
			System.out.println("links");
			if(this.left != null){
				check = this.left.search(value);
			}
		}
		else{
			System.out.println("rechts");
			if(this.right != null){
				check = this.right.search(value);
			}
		}
		return check;
	}
	else{
		return true;
	}
    }

    public void inorder(){
	if(left!=null){
		left.inorder();
	}
	System.out.println(inhalt + "; ");
	if(right!=null){
		right.inorder();
	}
    }
}


public class BinaryTree{
    public static void main(String[] Args){
        BinarySearchTree<Integer> baum = new BinarySearchTree<>(5);

	baum.insert(1);
	baum.insert(8);
	baum.insert(4);
	baum.insert(3);

	System.out.println(baum.search(8));
	System.out.println(baum.search(7));
	
	baum.inorder();
    }
}
