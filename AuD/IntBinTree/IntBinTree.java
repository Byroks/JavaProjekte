import aud.BinaryTree;

public class IntBinTree extends BinaryTree<Integer> {
  //---------------------------------------------------------------//
  public IntBinTree(int data) {
    super(data);
  }

  //---------------------------------------------------------------//
  public IntBinTree(int data, IntBinTree left, IntBinTree right) {
    super(data, left, right);
  }

  //---------------------------------------------------------------//
  public int height(int i) {
	IntBinTree left = (IntBinTree) getLeft();
        IntBinTree right = (IntBinTree) getRight();
        
        int max=1;

        if(getLeft()!=null){
                max=left.height(i+1);
        }
        if(getRight()!=null){
                max=right.height(i+1);
        }

        if(i>max){
                max=i;
        }
        
        return max;
  }

  //---------------------------------------------------------------//
  public int Sum() {
	int dummy = 0;
	if(getLeft()!=null){
	IntBinTree left = (IntBinTree) getLeft();
	dummy+=left.Sum();
	}

	if(getLeft()!=null){
	IntBinTree right = (IntBinTree) getRight();
	dummy+=right.Sum();
	}
	
	return dummy+getData();
  }

  public int maxSum() {
	IntBinTree left = (IntBinTree) getLeft();
	IntBinTree right = (IntBinTree) getRight();
	int l = left.Sum();
	int r = right.Sum();
	return l>r ? l : r;
  }

  //---------------------------------------------------------------//
  public int maxPath(int i) {
	IntBinTree left = (IntBinTree) getLeft();
	IntBinTree right = (IntBinTree) getRight();
	
	int max=1;

	if(getLeft()!=null){
		max=left.maxPath(i+getData());
	}
	if(getRight()!=null){
		max=right.maxPath(i+getData());
	}
	
	if(i>max){
		max=i;
	}
	
	return max;
  }

  //---------------------------------------------------------------//
  public static void main(String[] args) {
	IntBinTree sechs = new IntBinTree(6);
	IntBinTree drei = new IntBinTree(3);
	IntBinTree elf = new IntBinTree(100, drei, null);
	IntBinTree vier = new IntBinTree(4, sechs, elf);
	IntBinTree funf = new IntBinTree(5);
	IntBinTree sieben = new IntBinTree(7);	
	IntBinTree eins = new IntBinTree(1, funf, sieben);
	IntBinTree acht = new IntBinTree(-8, vier, eins);

	System.out.println(acht.maxPath(0));
  }
}
