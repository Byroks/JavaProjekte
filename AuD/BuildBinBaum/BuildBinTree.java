

import aud.BinaryTree;
import aud.util.DotViewer;
import aud.util.SingleStepper;

public class BuildBinTree {
	public static void main(String[] args) {
		SingleStepper stepper = new SingleStepper("Building the binary Tree ! "+" Steps");
		BinaryTree<Integer> root = new BinaryTree<Integer>(-8);
		BinaryTree<Integer> left1 = new BinaryTree<Integer>(4);
		BinaryTree<Integer> right1 = new BinaryTree<Integer>(1);
		BinaryTree<Integer> left2 = new BinaryTree<Integer>(6);
		BinaryTree<Integer> leftright = new BinaryTree<Integer>(-11);
		BinaryTree<Integer> right2 = new BinaryTree<Integer>(7);
		BinaryTree<Integer> rightleft = new BinaryTree<Integer>(5);

		DotViewer viewer = DotViewer.displayWindow(root, "Building the binary tree");
		
		stepper.halt("Setze als Wurzel");
		viewer.display(root);

		stepper.halt("Setze 4 als linken Teilbaum der Wurzel");
		root.setLeft(left1);
		viewer.display(root);
		
		stepper.halt("Setze 1 als rechten Teilbaum der Wurzel");
		root.setRight(right1);
		viewer.display(root);
		
		stepper.halt("Setze 6 als linken Teilbaum von left1");
		left1.setLeft(left2);
		viewer.display(root);
		
		stepper.halt("Setze -11 als rechten Teilbaum von left1");
		left1.setRight(leftright);
		viewer.display(root);
		
		stepper.halt("Setze 5 als linken Teilbaum von right1");
		right1.setLeft(rightleft);
		viewer.display(root);
		
		stepper.halt("Setze 7 als rechten Teilbaum von right1");
		right1.setRight(right2);
		viewer.display(root);
		
		System.out.println("preorder"+root.preorder());
		System.out.println("postorder"+root.postorder());
		System.out.println("levelorder"+root.levelorder());
		System.out.println("inorder"+root.inorder());
	}
}