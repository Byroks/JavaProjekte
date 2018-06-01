import aud.BTree;
import aud.KTreeNode;

public class MyBTree {

    public static int height(BTree b){
        if(b.root().getChild(0) != null){
            return _height(b.root().getChild(0), 1);
        }
        return 0;
    }

    private static int _height(KTreeNode b, int i){
        if(b.getChild(0) != null){
            return _height(b.getChild(0), i+1);
        }
        else{
            return i;
        }
    }

    public static void main(String[] Args){
        //SingleStepper stepper = new SingleStepper("");
        BTree<Integer> Baum = new BTree<>(2);
        //DotViewer viewer = DotViewer.displayWindow(Baum, "Building the binary tree");
        for(int i = 0; i<1000000; i++){
            Baum.insert(Math.round((float)(Math.random()*100000)));
        }
        /*Baum.insert(6);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(18);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(3);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(11);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(16);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(7);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(10);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(1);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(8);
        stepper.halt("");
        viewer.display(Baum);
        Baum.insert(12);
        stepper.halt("");
        viewer.display(Baum);*/
        System.out.println(height(Baum));
    }

}
