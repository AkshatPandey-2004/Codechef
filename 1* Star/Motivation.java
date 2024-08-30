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
            int N=sc.nextInt();
            int X=sc.nextInt();
            int[] space=new int[N];
            int[] rating=new int[N];
            for(int i=0;i<N;i++){
                space[i]=sc.nextInt();
                rating[i]=sc.nextInt();
            }
            int max=0;
            for(int i=0;i<N;i++){
                if(max<rating[i] && X>=space[i]){
                    max=rating[i];
                }
            }
            System.out.println(max);
            
        }
	}
}
