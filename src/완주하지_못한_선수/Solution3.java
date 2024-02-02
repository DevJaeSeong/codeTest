package 완주하지_못한_선수;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution3 implements Solution {
	
	@Override
    public String solution(String[] participant, String[] completion) {
    	
    	List<String> participantList = new ArrayList<>(List.of(participant));
    	List<String> completionList = new ArrayList<>(List.of(completion));		
		
    	participantList.sort(Comparator.naturalOrder());
    	completionList.sort(Comparator.naturalOrder());
    	
    	for (int i = 0; i < completionList.size(); i++) {
    		
    		if (!participantList.get(i).equals(completionList.get(i))) {
    			
    			return participantList.get(i);
    		}
    	}
    	
        return participantList.get(participantList.size() - 1);
    }
}
