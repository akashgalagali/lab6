package lab6;

public class CountWithout {

	public static void main(String[] args) {

	String str="aaaabbbsshhhzkkkjjoo";
		 int count[] = new int[256];
	        int len = str.length();
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	 
	        char ch[] = new char[str.length()];
	        for(int i=0;i<count.length;i++)
	        	if(count[i]!=0)
	        		System.out.print((char)i+ "" +count[i]);
	}

}
