package 완주하지_못한_선수.main;

import 완주하지_못한_선수.solution.Solution;
import 완주하지_못한_선수.solution.Solution3;

public class Main {

	public static void main(String[] args) {
		
		Solution solution = new Solution3();
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String result = solution.solution(participant, completion);
		
		System.out.println("result => " + result);
	}
}
