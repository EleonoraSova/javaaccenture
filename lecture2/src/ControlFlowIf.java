
public class ControlFlowIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int x = 10;
	    int y = 22;
	    
	    if(x>y){
	    	System.out.println("X < Y");
	    }
        
	    int numberCheck = 21;
	    
	    if(numberCheck % 2 == 0){ // 1 == 0 return false
	    	System.out.println(numberCheck + " is even");
	    }else{
	    	System.out.println(numberCheck + " is odd");
	    }
	    
	    
	    
	    int mark = 50;
	    
	    if(mark >= 50){ 
	    	System.out.println("Pass");
	    }else{
	    	System.out.println("Fail");
	    }
	    System.out.println();
	    System.out.println("Done");
	}

}
