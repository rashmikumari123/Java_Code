/*2d array key found*/
		
import java.util.*;
public class KeyFound
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int column = sc.nextInt();
	    
	       int number[][] = new int[row][column];
	        int x=5;
	      
	    
		for(int i=0; i<row; i++)
		{
		    for(int j=0; j<column; j++)
		    {
		        number[i][j]=sc.nextInt();
		    }
		}
		
			for(int i=0; i<row; i++)
		{
		    for(int j=0; j<column; j++)
		    {
		        if(number[i][j]==x){
		         System.out.println("x found at"+" "+i+" "+j);
		         System.exit(0);
		        }
		        
		    }
		   
		}
		 System.out.println("key not found");
		
	}
}