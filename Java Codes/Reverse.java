/*REVERSE COPY OF AN ARRAy*/

public class Reverse
{
	public static void main(String[] args) {
		int A[]={6,9,5,8};
		int B[]= new int [4];
		
		for(int i=A.length-1, j=0; i>=0; i--, j++){
		    B[j]=A[i];
		}
		
		for(int x:A)
		System.out.print(x+",");
		
		System.out.println("");
		for(int x:B)
		System.out.print(x+",");
}
}