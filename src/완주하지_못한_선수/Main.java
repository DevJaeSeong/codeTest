package 완주하지_못한_선수;

public class Main {

	private static Solution solution = new Solution3();
	
	/**
	 * <h2>문제 설명</h2>
	 * <p>
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 
	 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	 * </p>
	 * <hr>
	 * 
	 * <h2>제한사항</h2>
	 * <p>
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 
	 * </p>
	 * <ul>
	 * 	<li>마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.</li>
	 * 	<li>completion의 길이는 participant의 길이보다 1 작습니다.</li>
	 * 	<li>참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.</li>
	 * 	<li>참가자 중에는 동명이인이 있을 수 있습니다.</li>
	 * </ul>
	 * <hr>
	 * 
	 * <h2>입출력 예</h2>
	 * <table border="1">
	 *     <tr>
	 *         <th>participant</th>
	 *         <th>completion</th>
	 *         <th>return</th>
	 *     </tr>
	 *     <tr>
	 *         <td>["leo", "kiki", "eden"]</td>
	 *         <td>["eden", "kiki"]</td>
	 *         <td>"leo"</td>
	 *     </tr>
	 *     <tr>
	 *         <td>["marina", "josipa", "nikola", "vinko", "filipa"]</td>
	 *         <td>["josipa", "filipa", "marina", "nikola"]	</td>
	 *         <td>"vinko"</td>
	 *     </tr>
	 *     <tr>
	 *         <td>["mislav", "stanko", "mislav", "ana"]</td>
	 *         <td>["stanko", "ana", "mislav"]</td>
	 *         <td>"mislav"</td>
	 *     </tr>
	 * </table>
	 * <hr>
	 * 
	 * <h2>입출력 예 설명</h2>
	 * <p>
	 * 예제 #1 <br>
	 * "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
	 * </p>
	 * 
	 * <p>
	 * 예제 #2 <br>
	 * "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
	 * </p>
	 * 
	 * <p>
	 * 예제 #3 <br>
	 * "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
	 * </p>
	 * <hr>
	 * 
	 * @see https://school.programmers.co.kr/learn/courses/30/lessons/42576
	 */
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String result = solution.solution(participant, completion);
		
		System.out.println("result => " + result);
	}
}
