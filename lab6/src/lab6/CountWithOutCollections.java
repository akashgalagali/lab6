package lab6;

public class CountWithOutCollections {

	public static void main(String[] args) {
		String str = "aaaabbbsshhhzkkkjjoo";
		int find=0;
		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i));
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j))
					find++;
			}
			System.out.println(str.charAt(i)+""+find);
			find=0;
		}
	}

}
