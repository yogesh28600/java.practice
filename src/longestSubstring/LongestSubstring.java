package longestSubstring;


public class LongestSubstring {
	int max;
	    int lengthOfLongestSubstring(String s) {
		int counter=1;
		
		for(int i=0;i<s.length()-2;i++) {
			if(s.charAt(i)+1 == s.charAt(i+1)) {
				counter++;
			}else {
				max=counter;
				counter=1;
			}
		}
		return max;
	}
	public static void main(String[]args) {
		LongestSubstring lss=new LongestSubstring();
		System.out.println(lss.lengthOfLongestSubstring("abcdefghklmno"));
	}

}
