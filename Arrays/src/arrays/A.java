package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A {

	public static void main(String[] args) {
	//	alphaOrder1();
		//alphaOrder2();
		//alphaOrder3();
		
	//	getnum();
		
		alphaOrder4();
	}
	
	static void alphaOrder1()
	{
		System.out.println("gh".compareTo("gk"));
		
		
	}
	
	static void alphaOrder2()
	 {
		String[] name={"hg", "gk1","gk2", "hg3", "gh5", "gh7", "hg29", "gh65"};
		//String[] name={"gh5","gh65","gh7","hg"};
		 //String[] name={"Bangalore","Mangalore","delhi","Vijay","Gadag","A","A1","AB","Ab","ab","a"};
		 for(int i=0;i<name.length;i++)
		 {
			 for(int j=i+1;j<name.length;j++)
			 {
				 int value=name[i].compareToIgnoreCase(name[j]);
						 if(value<=0)
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
		 System.out.println(Arrays.toString(name));
	 }
	 
	static void alphaOrder3()
	 {
		String[] name={"hg", "gk1", "hg3", "gh5", "gh7", "hg29", "gh65"};
		//String[] name={"gh5","gh65","gh7","hg"};
		 //String[] name={"Bangalore","Mangalore","delhi","Vijay","Gadag","A","A1","AB","Ab","ab","a"};
		 for(int i=0;i<name.length;i++)
		 {
			 for(int j=i+1;j<name.length;j++)
			 {
				 int value=name[i].substring(0, 1).compareToIgnoreCase(name[j].substring(0, 1));
						 if(value<=0)
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
	static void getnum()
	{
		String s="vijay12345";
		String num="";
		for(char i:s.toCharArray())
		{
			if(Character.isDigit(i)) num+=i;
		}
		System.out.println(num);
	}
	static void alphaOrder4()
	{
		String[] name={"hg", "gk1", "hg3", "gh5","gh5", "gh7", "hg29", "gh65"};
		 for(int i=0;i<name.length;i++)
		 {
			 for(int j=i+1;j<name.length;j++)
			 {
				 String s1=name[i];
				 String s2=name[j];
				 String s1num="";
					String s1string="";
					String s2num="";
					String s2string="";
					for(char k:s1.toCharArray())
					{
						if(Character.isDigit(k)) s1num+=k;
						else if (Character.isAlphabetic(k)) s1string+=k;
							
					}
					for(char l:s2.toCharArray())
					{
						if(Character.isDigit(l)) s2num+=l;
						else if (Character.isAlphabetic(l)) s2string+=l;
							
					}
					
					int x;
					if(!s1num.equals("")) x=Integer.parseInt(s1num); else x=0;
						
					int y;
					if(!s2num.equals("")) y=Integer.parseInt(s2num); else y=0;
					
					int compnum=s1string.compareTo(s2string);
					if(compnum==0 && s1num.equals(s2num))
					{
					continue;
					}
					else if(compnum<=0)
					{
						if(x<y || x==y)
						{
							continue;
						}
						else
						{
							String temp=name[i];
							name[i]=name[j];
							name[j]=temp;
						}
					}
					else
					{
						String temp=name[i];
						name[i]=name[j];
						name[j]=temp;
					}
			 }
		 }
		 
		 System.out.println(Arrays.toString(name));
			 

	}
	
	

}
