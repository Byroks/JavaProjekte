//-----------------------------------------------------------------//
public class SimpleTree<T extends Comparable<T>> {
  //---------------------------------------------------------------//
  SimpleTree<T> left = null;
  SimpleTree<T> right = null;
  T data = null;

  //---------------------------------------------------------------//
  public SimpleTree(T d){
      data = d;
  }

  public SimpleTree() {
  }

  //---------------------------------------------------------------//
  public void add(T obj) {
      if (data == null) data = obj;
      else if(!data.equals(obj)){
          if(data.compareTo(obj)>0){
              if(left != null){
                  left.add(obj);
              }
              else{
                  left = new SimpleTree<T>(obj);
              }
          }
          else{
              if(right != null){
                  right.add(obj);
              }
              else{
                  right = new SimpleTree<T>(obj);
              }
          }
      }
  }

  //---------------------------------------------------------------//
  public boolean contains(T obj) {
      boolean x = false;

      if(!data.equals(obj)){
          if(data.compareTo(obj)>0){
              if(left != null){
                  x = left.contains(obj);
              }
              else{
                  return false;
              }
          }
          else{
              if(right != null){
                  x = right.contains(obj);
              }
              else{
                  return false;
              }
          }
      }
      else {
          return true;
      }

      return x;
  }

  //---------------------------------------------------------------//
  public String toString() {
      String st = "";

      if(left != null) st += left.toString();
      st += data + " ";
      if(right != null) st += right.toString();

      return st;
  }

  //---------------------------------------------------------------//
  public static void main(String[] args) {
      SimpleTree<Integer> tree = new SimpleTree<Integer>();
      //DotViewer viewer = DotViewer.displayWindow((String) null, null);
      tree.add(4);
      tree.add(2);
      tree.add(4);
      tree.add(6);
      tree.add(10);
      tree.add(12);
      tree.add(7);
      System.out.print(tree.contains(6) + "\n");
      System.out.print(tree.contains(2) + "\n");

      System.out.println("Inorder output: " + tree.toString());
  }
}
