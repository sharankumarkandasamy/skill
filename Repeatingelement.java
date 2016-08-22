package MS2;

import java.util.HashSet;

public class Repeatingelement 
{
	 static void Repeating(int arr[])
	{
		int small =-1;
		HashSet<Integer>set=new HashSet<>();
		for(int k=arr.length-1;k>=0;k--)
		{
			if(set.contains(arr[k]))
			{
			   small=k;
			}
			else
			{
				set.add(arr[k]);
			}
		}
			if(small!=-1)
			{
				System.out.println("The first repeating element is: "+arr[small]);
			}
			else
			{
				System.out.println("there are no repeating elements");
			}
		
	}
       public static void main(String[] args)
{
				int j[]={5,4,5,3,9,6};
			Repeating(j);
	}
				
}

		
	


