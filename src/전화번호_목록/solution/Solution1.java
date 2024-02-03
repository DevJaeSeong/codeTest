package 전화번호_목록.solution;

import java.util.Arrays;

public class Solution1 implements Solution {

	@Override
	public boolean solution(String[] phone_book) {
		
		Arrays.sort(phone_book);
		
		int phoneBookSize = phone_book.length;
		int phoneBookMaxIndex = phoneBookSize - 1;
		
		for (int i = 0; i < phoneBookSize; i++) {
			
			if (i == phoneBookMaxIndex) break;
			
			String phoneNum1 = phone_book[i];
			String phoneNum2 = phone_book[i + 1];
			
			if (phoneNum2.indexOf(phoneNum1) == 0) return false;
		}
		
		return true;
	}
}
