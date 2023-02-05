package Javaprograms;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Arry Size");
		int size = scan.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter Array value");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
			
		}
		int unique[] = new int[a.length]; int u = 0;
		int counter[] = new int[a.length]; int c = 0;
		
		
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			//System.out.println(a[i]+" "+count);
			
			if(u==0)
			{
				unique[u++] = a[i];
				counter[c++]= count;
			}
			else
			{
				int f =0;
				for(int k=0;k<u;k++)
				{
					if(unique[k]==a[i])
						f++;
				}
				
				if(f==0)
				{
					unique[u++] = a[i];
					counter[c++]= count;
				}
				}
			
			
		}
		for(int i=0;i<u;i++)
		{
			System.out.println(unique[i]+" "+counter[i]);
	
		}
		
		
	}
}
