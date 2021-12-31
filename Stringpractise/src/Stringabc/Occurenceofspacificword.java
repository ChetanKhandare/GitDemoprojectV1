package Stringabc;

public class Occurenceofspacificword {

	public static void main(String[] args) {
		
		String s1="MynameischetanMy";
		String s2="";
		int count=0;
		int len=s1.length();
		System.out.println(len);
		for(int i=0;i<=len-1;i++)
		{
			if(s1.charAt(i)=='M'&& s1.charAt(i+1)=='y')
			{
				count++;
			}
			
		}
		System.out.println(count);
		System.out.println(count);
			

	}

}
