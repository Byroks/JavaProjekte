import aud.Queue;
import aud.example.expr.*;
import aud.example.expr.AtomicExpression.Type;
import aud.util.*;
public class ExprWithPow extends ExpressionParser2{
	
	public class Power extends Operator {
		  /** create operation */
		  public Power() {}

		  @Override public double getValue() {
		    ExpressionTree left =(ExpressionTree) node_.getLeft();
		    ExpressionTree right=(ExpressionTree) node_.getRight();
		    double x = left.getData().getValue();				//power berechnung	//changed
		    double result = x;														//changed
		    for (int i = 1; i < right.getData().getValue(); i++){					//changed
		    	result = result * x;
		    }
		    return result;
		  }
		  @Override public Type getType() { return Type.OpPower; }
		  @Override public String toString() { return "^"; }
		}
	
	
	@Override protected ExpressionTree product(int level){
		verbose(level,"<product>");
		   
	    // temporary storage
	    Queue<ExpressionTree> expr = new Queue<ExpressionTree>();
	    Queue<Integer>        op   = new Queue<Integer>();
	    
	    ExpressionTree tree=power(level+1);						//power statt factor
	    
	    // parse iteratively
	    while (lookahead()==Tokenizer.TIMES || lookahead()==Tokenizer.DIVIDE) {
	      op.enqueue(lookahead());
	      nextToken();      
	      expr.enqueue(power(level+1));      					//power statt factor
	    }
	          
	    // setup tree
	    while (!op.is_empty()) {      
	      if (op.dequeue()==Tokenizer.TIMES) 
	        tree=new ExpressionTree(new Times(),tree,expr.dequeue());
	      else
	        tree=new ExpressionTree(new Divide(),tree,expr.dequeue());
	    }
	    return tree;
	}

	// maybe overwrite methods  
		
   public ExpressionTree power(int level) {
	   verbose(level,"<power>");
	   
	    // temporary storage
	    Queue<ExpressionTree> expr = new Queue<ExpressionTree>();
	    Queue<Integer>        op   = new Queue<Integer>();
	    
	    ExpressionTree tree=factor(level+1);
	    
	    // parse iteratively
	    while (lookahead()==Tokenizer.POWER) {
	      op.enqueue(lookahead());
	      nextToken();      
	      expr.enqueue(factor(level+1));      
	    }
	          
	    // setup tree
	    while (!op.is_empty()) {      
	      if (op.dequeue()==Tokenizer.POWER) 
	        tree=new ExpressionTree(new Power(),tree,expr.dequeue());
	    }
	    return tree;
   }

   public static void main(String[] args) {
	   String input=(args.length>0) ? args[0] : "2^(3+5*2-3^2)+(10-13)";
	   System.out.println("input = '" + input + "'");
	   
	   ExprWithPow p = new ExprWithPow();
	   p.setVerbose(true);
	   ExpressionTree tree = p.parse(input);
	   
	   System.out.println("output = '" + tree + "'");
	   
	   System.out.println(tree.postorder().toString());
	   
	   System.out.println(tree.getValue());
	   }
}

