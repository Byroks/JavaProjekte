import java.util.Arrays;

interface SortArray {
	public void setArray(int[] a); //set reference to array a
	public int[] getArray(); //get actual reference
	public void printArray(); //print array
	public void sort(); //sort array
}

// implement abstract class AbstractSortArray

abstract class AbstractSortArray implements SortArray{
	int [] workarray;
	
	public void setArray(int[] a) {
		this.workarray =a;
				
	}
	public int[] getArray(){
		return this.workarray;
		
	}
	
	public void printArray(){
		if (this.workarray.length==0){
			System.out.println("Array leer");
		}
		else 
			for (int i =0; i<this.workarray.length;i++){
			System.out.println(this.workarray[i]);
		}
	}
	
	public void sort(){
		
	}
	
}

class SortAlgorithm1 extends AbstractSortArray{
	
	public SortAlgorithm1 (int[] d){
		this.workarray=d;
	}
	
	public void sort(){
		
		  int leng = this.workarray.length;
		  
	        for (int i = 0; i < leng-1; i++){
	            for (int j = 0; j < leng-i-1; j++){
	                if (this.workarray[j] > this.workarray[j+1])
	                {
	                    
	                    int zahl = this.workarray[j];
	                    this.workarray[j] = this.workarray[j+1];
	                    this.workarray[j+1] = zahl;
	                }
	            }
		
	        }
		}
	
}

class SortAlgorithm2 extends AbstractSortArray{
	
	public SortAlgorithm2 (int[] d){
		this.workarray=d;
	}
	
	
public void sort(){
	
	int lange = this.workarray.length;
	int zahl=0;
	
	 for (int i = 0; i < lange; i++) {
         for (int j = lange-1; j > 0; j--) {
             if (this.workarray[j-1] > this.workarray[j]) {
                 zahl = this.workarray[j];
                 this.workarray[j] = this.workarray[j - 1];
                 this.workarray[j-1] = zahl;
             	}
         	}
	 	}
	
	}
}

public class Sort {		
	public static void main(String[] args) {
	int [] simon = {3,7,5,2,3,6,8,9,5,3,4,6,8};
	
	SortAlgorithm1 benji= new SortAlgorithm1(simon);
	benji.sort();
	//benji.printArray();
	
	SortAlgorithm2 dennis = new SortAlgorithm2(simon);
	dennis.sort();
	//dennis.printArray();
	
	int [] test =  {9,8,6,5,4,3,2,1};
	benji.setArray(test);
	benji.sort();
	benji.printArray();
	
	
	}	
}
