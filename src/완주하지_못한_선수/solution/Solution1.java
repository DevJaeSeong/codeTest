package 완주하지_못한_선수.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1 implements Solution {
	
	@Override
    public String solution(String[] participant, String[] completion) {
    	
    	List<String> participantList = new ArrayList<>(List.of(participant));
    	List<String> completionList = new ArrayList<>(List.of(completion));
    	
    	participantList.sort(Comparator.naturalOrder());
    	completionList.sort(Comparator.naturalOrder());
    	
    	while (completionList.size() > 0) {
    		
    		removeDupEliment(participantList, completionList);
    	}
    	
        return participantList.get(0);
    }
    
    private void removeDupEliment(List<String> participantList, List<String> completionList) {
    	
    	for (int i = 0; i < participantList.size(); i++) {
    		
    		for (int j = 0; j < completionList.size(); j++) {
    			
    			if (participantList.get(i).equals(completionList.get(j))) {
    				
    				participantList.remove(i);
    				completionList.remove(j);
    				
    				return;
    			}
    		}
    	}
    }
}
