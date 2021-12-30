package Stringabc;

public class Reversestringcharbychar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="My name is Chetan";
		String s2="";
		
		String []s3=s1.split(" ");
		int len=s3.length;
		System.out.println(len);

		for(int i=s3.length-1;i>=0;i--)
		{
			for(int j=s3[i].length();j>0;j--)
			{
				s2=s2+s3[i].charAt(j-1);
				
			}
			s2=s2+" ";
		}
			System.out.println(s2);
			
			
		
		
	}

}
