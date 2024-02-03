package 전화번호_목록.main;

import 전화번호_목록.solution.Solution;
import 전화번호_목록.solution.Solution1;

public class Main {

	public static void main(String[] args) {
		
		Solution solution = new Solution1();
		
		String[] phone_book = {"819232312", "976", "119552", "2"};
		
		boolean result = solution.solution(phone_book);
		
		System.out.println("result ==> " + result);
	}
}
