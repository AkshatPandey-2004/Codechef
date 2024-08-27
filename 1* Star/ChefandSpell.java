import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    t--;
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    int sum=A+B;
		    if(sum<A+C){
		        sum=A+C;
		    }
		    if(sum<B+C){
		        sum=B+C;
		    }
		    System.out.println(sum);
		}

	}
}
