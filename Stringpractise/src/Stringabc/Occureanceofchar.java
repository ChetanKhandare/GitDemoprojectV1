package Stringabc;

public class Occureanceofchar {

	public static void main(String[] args) {

String s1="Cheetane";
int count=0;  
int len=s1.length();
  System.out.println(len);
  for(int i=0;i<=len-1;i++)
  {
	  if(s1.charAt(i)=='e')
	  {
		  count++;
	  }
  }  
	  System.out.println(count);
	}
  




}
