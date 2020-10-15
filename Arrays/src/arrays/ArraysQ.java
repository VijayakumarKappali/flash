package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArraysQ {

	public static void main(String[] args) {
		//twoDimtoOne();
		//sort();
		//sortCharacter();
		//sortNum2();
		//displayFibonacci();
		//displayPrime(40);
		//missingNumber();
		//findFactorial(5);
		//matrixMultiplication();
		//duplicate();
		// duplicate2();
		//alphaOrder();
		//alphaOrder2();
		//alphaOrder3();
		//compare();
		int c[]={10,20,30,40,50};
		int b[]=reverseArray(c);
		System.out.println(Arrays.toString(b));
		
	}
	static void twoDimtoOne()
	{
		int a[][]={{11,22,33,44},{55,66,77,88}};
		int b[]=new int [a.length*a[0].length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[x]=a[i][j];
				x+=1;
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++");
		
		
		for (int kk:b)
		{
			System.out.println(kk);
		}
	}
	static void sort()
	{
          int a[]={10,50,65,5,21};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}	
	}
	
	static void sortCharacter()
	{
		String arr[]={"Z","X","A","M","P","Y"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	static void sortNum2()
	{
		Integer arr[]={9,7,5,14,52,154,52,1};
		List oList=Arrays.asList(arr);
		Collections.sort(oList);
		for(int i=0;i<oList.size();i++)
		{
			System.out.println(oList.get(i));
		}
	}
	
	static void displayFibonacci()
	{
		
			int firstNum=0;
			int secondNum=1;
			int thirdNum;
			System.out.println(firstNum);
			System.out.println(secondNum);
			for(int i=2;i<10;i++)
			{
				thirdNum=firstNum + secondNum;
				firstNum=secondNum;
				secondNum=thirdNum;
				System.out.println(thirdNum);
			}
		
	}
	
	static void displayPrime(int n)
	{
		
			int flag=0;
			for(int i=2;i<n;i++)
			{
				if((n%i)==0)
				{
					flag++;
				}
			}
			
			if(flag==0)
			{
				System.out.println("Prime number");
			}else{
				System.out.println("Not a prime number");
			}
		
	}
	
	static void missingNumber()
	{
		int arr[]={2,5,7,9,12};
		int max=arr[arr.length-1];
		
		int index=0;
		for(int i=0;i<max;i++)
		{
			if(i==arr[index])
			{
				index++;
			}else{
				System.out.print(" "+i);
			}
		}
	}
	
	static void findFactorial(int num)
	{
		int fact=1;
		for(int j=num;j>=1;j--)
		{
			fact=fact*j;
		}
		System.out.println(fact);
	}
	
	static void matrixMultiplication()
	{
		int m1[][]={{1,2,3},{4,5,6}};
		int m2[][]={{7,8},{9,10},{11,12}};
		int m1row=m1.length;
		int m1col=m1[0].length;
		int m2row=m2.length;
		int m2col=m2[0].length;
		
		int res[][]=new int[m1row][m2col];
		boolean condn=(m1[0].length==m2.length);
		
		if(condn){
		for(int i=0;i<m1row;i++)
		{
			for(int j=0;j<m2col;j++)
			{
				for(int k=0;k<m2row;k++)
				{
					res[i][j]+=m1[i][k]*m2[k][j];
					
				}
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
		}
	

}
	static void duplicate()
	{
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    } 
	
	static void duplicate2()
	{
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
        HashSet<String> set = new HashSet<String>();
  
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }    
	
	static void equality()
	{
		 int[] arrayOne = {21, 57, 11, 37, 24};
         
	        int[] arrayTwo = {21, 57, 11, 37, 24};
	          
	        boolean equalOrNot = true;
	          
	        if(arrayOne.length == arrayTwo.length)
	        {
	            for (int i = 0; i < arrayOne.length; i++)
	            {
	                if(arrayOne[i] == arrayTwo[i])
	                {
	                    equalOrNot = true;
	                }
	            }
	        }
	        else
	        {
	            equalOrNot = false;
	        }
	}
	
	static void equality2()
	{
		int[] arrayOne = {21, 57, 11, 37, 24};
        
        int[] arrayTwo = {21, 57, 11, 37, 24};
        
        if(Arrays.equals(arrayOne, arrayTwo))
        {
        	System.out.println("Both Arrays are equal");
        }
        else
        {
        	System.out.println("Both arrays are not equal");
        }
	}
	
	//Write a java program to find all pairs of elements in an
	//integer array whose sum is equal to a given number?
	
	static void findThePairs(int inputArray[], int inputNumber)
    {
       
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
  
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
         
        System.out.println("======================================");
    }
	
	// Write a java program to find the intersection of two arrays?
	
	 static void intersection()
    {
        String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
  
        HashSet<String> set = new HashSet<String>();
  
        for (int i = 0; i < inputArray1.length; i++)
        {
            for (int j = 0; j < inputArray2.length; j++)
            {
                if(inputArray1[i].equals(inputArray2[j]))
                {
                    set.add(inputArray1[i]);
                }
            }
        }
  
        System.out.println("Common Elements : "+set);     
    }
	 
	 static void alphaOrder()
	 {
		 String[] name={"Atti","Mava","Apu","Vijay","Gunda","A","AB","Ab","ab","a"};
		 Arrays.sort(name);
		 System.out.println(Arrays.toString(name));
	 }
	 
	 static void alphaOrder2()
	 {
		 String[] name={"Atti","Mava","Apu","Vijay","Gunda","A","AB","Ab","ab","a"};
		List<String> list= Arrays.asList(name);
		Collections.sort(list);
		System.out.println(list);

		 
	 }
	 
	 static void alphaOrder3()
	 {
		 String[] name={"Atti","Mava","Apu","Vijay","Gunda","A","AB","Ab","ab","a"};
		 for(int i=0;i<name.length;i++)
		 {
			 for(int j=i+1;j<name.length;j++)
			 {
				 int value=name[i].substring(0, 1).compareToIgnoreCase(name[j].substring(0, 1));
						 if(value==0)
						 {
							 continue;
						 }
						 else if(value<0)
						 {
							 continue;
						 }
						 else if(value>0)
						 {
							 String temp=name[i];
							 name[i]=name[j];
							 name[j]=temp;
						 }
				 
			 }
		 }
		 for(String st:name)
		 {
			 System.out.println(st);
		 }

	 }
	 
	 static void compare()
	 {
		 int i=(int) 'b';
		 System.out.println(i);
		 System.out.println("A".compareTo("B"));;
	 }
	 
	 static int[] reverseArray(int[] a)
	 {
		 int j=a.length-1;
		 for(int i=0;i<a.length/2;i++)
		 {
			 int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			j--;
		 }
		 return a;
	 }
	

}
