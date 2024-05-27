/*Transpose of a Matrix*/
import java.util.*;
public class Transpose

{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int A[][]= new int[n][m];
	    int B[][]= new int[n][m];
	    
	    /* enter the input*/
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            A[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("the original matrix");
	    
	    /*display A[][] matrix*/
	    for(int x[]:A){
	        for(int y:x){
	          System.out.print(y+" ");
	        }
	        System.out.println("");
	    }
	    
	    /*transpose a matrix
	    for(int j=0;j<m; j++){
	        for(int i=0; i<n; i++){
	            B[i][j]=A[i][j];
	            System.out.print(B[i][j]+" ");
	        }
	        System.out.println("");
	    }*/ 
	    
	    System.out.println("transpose of a MATRIX");
	      for(int i=0; i<n; i++){
	   
	        for(int j=0; j<m; j++){
	            B[i][j]=A[j][i];
	            System.out.print(B[i][j]+" ");
	        }
	        System.out.println("");
	    }
		
	}
}


