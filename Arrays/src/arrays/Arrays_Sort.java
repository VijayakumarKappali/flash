package arrays;

import java.util.Arrays;
import java.util.Comparator;
class Mycomparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);    //for descending order
	}
	
}

public class Arrays_Sort {

	public static void main(String[] args) {
		int a[]={80,20,50,30,100};
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		Arrays.sort(a);
		System.out.println("After sorting++++++++++");
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("++++++++++ Strings ++++++++");
		String[] s={"Z", "K","B","D","L"};
		for(String b:s)
		{
			System.out.println(b);
		}
		
		Arrays.sort(s);
		System.out.println("After sorting++++++++++");
		for(String b:s)
		{
			System.out.println(b);
		}
		
		System.out.println("+++++ using custom sort  ++++++++");
		Arrays.sort(s, new Mycomparator());
		for(String b:s)
		{
			System.out.println(b);
		}
		
		

	}

}
