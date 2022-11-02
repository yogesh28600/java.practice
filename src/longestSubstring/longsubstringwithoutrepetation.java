package longestSubstring;
import java.util.*;

public class longsubstringwithoutrepetation {

	public int lengthOfLongestSubstring(String s) {

		ArrayList<Character> al=new ArrayList<>();
		for(int i=0;i<=s.length()-1;i++) {
			if(!al.contains(s.charAt(i))) {
				
				al.add(s.charAt(i));
				
			}
		}
		return al.size();
	}
	public static void main(String[] args) {
		longsubstringwithoutrepetation lss=new longsubstringwithoutrepetation();
		System.out.println(lss.lengthOfLongestSubstring("pwwkew"));

	}

}
