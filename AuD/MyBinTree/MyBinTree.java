import aud.BinaryTree;
import aud.Queue;

public class MyBinTree<T> extends BinaryTree<T> {
    public MyBinTree(T data) {
        super(data);
    }

    public MyBinTree(T data, MyBinTree<T> left, MyBinTree<T> right) {
        super(data, left, right);
    }

    public int maxWidth() {
        int max = 0;
        int counter = 0;
        Queue<BinaryTree<T>> queue = new Queue<BinaryTree<T>>();
        queue.enqueue(this);
        queue.enqueue(null);
        while (!queue.is_empty()) {
            BinaryTree<T> subtree = queue.dequeue();

            if (subtree == null) {
                max = Math.max(max, counter);
                counter = 0;
                if (!queue.is_empty()) {
                    queue.enqueue(null);
                }
                continue;
            }

            counter++;

            if (subtree.getRight() != null) {
                queue.enqueue(subtree.getRight());
            }

            if (subtree.getLeft() != null) {
                queue.enqueue(subtree.getLeft());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MyBinTree<Integer> tree = new MyBinTree<Integer>(-8,
                new MyBinTree<Integer>(4,
                        new MyBinTree<Integer>(6,
                                new MyBinTree<Integer>(10, null, null),
                                null),
                        new MyBinTree<Integer>(-11, null, null)),
                new MyBinTree<Integer>(1,
                        new MyBinTree<Integer>(5, null, null),
                        new MyBinTree<Integer>(7, null, null)));

        System.out.println(tree.levelorder());
        System.out.println(tree.maxWidth());
    }
}
