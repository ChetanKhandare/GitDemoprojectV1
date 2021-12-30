package Stringabc;

public class Removewhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Chetan";
		String s2="";
          String[] s1=s.split(" ");
		int len=s1.length;
        for(int i=0;i<=len-1;i++)
        {
     	
        	s2=s2+s1[i];
        	
        }
        System.out.println(s2);
        
		
	}

}
