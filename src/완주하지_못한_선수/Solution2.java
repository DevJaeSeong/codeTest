package 완주하지_못한_선수;

import java.util.ArrayList;
import java.util.List;

public class Solution2 implements Solution {
	
	@Override
    public String solution(String[] participant, String[] completion) {
    	
    	List<String> participantList = new ArrayList<>(List.of(participant));
    	List<String> completionList = new ArrayList<>(List.of(completion));		
		
		for (int i = 0; i < completionList.size(); i++) {
			
			removeElement(participantList, completionList.get(i));
		}
    	
        return participantList.get(0);
    }

	private void removeElement(List<String> participantList, String completionElement) {
		
		for (int i = 0; i < participantList.size(); i++) {
			
			if (participantList.get(i).equals(completionElement)) {
				
				participantList.remove(i);
				return;
			}
		}
	}
}
