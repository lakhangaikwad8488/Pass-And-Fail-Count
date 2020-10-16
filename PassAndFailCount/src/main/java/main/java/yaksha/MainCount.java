package main.java.yaksha;

import java.io.IOException;
import java.util.Scanner;

public class MainCount {
	 public static void main (String[] args) throws IOException {
	       Scanner sc=new Scanner(System.in);
	       Count c=new Count();
	        System.out.println("Enter the no of subjects:");
	        int n=sc.nextInt();
	        int count=0;
	        if(n<=0)
	        {
	            System.out.println("Invalid input range");
	        }
	        else
	        {
	        	int arr[]=new int[20];
	    		System.out.println("Enter the "+n+" subjects marks:");
	            for(int i=0;i<n;i++)
	            {
	                arr[i]=sc.nextInt();
	            }
	         count=c.isPass(n,arr);
	         
	        int k=n-count;
	        if(count==0)
	        {
	            System.out.println("Ram failed in all subjects");
	        }
	        else if(count==n)
	        {
	            System.out.println("Ram passed in all subjects");
	        }
	        else
	        {
	            System.out.println("Ram passed in "+count+" subjects and failed in "+k+" subjects");
	        }
	        }
	    }
}
