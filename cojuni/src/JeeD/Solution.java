package JeeD;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> partiMap = new HashMap<String, Integer>();
        //HashMap<String, Integer> compiMap = new HashMap<String, Integer>();
        for(String parti : participant) {
        	if(partiMap.containsKey(parti)) {
        		partiMap.put(parti, partiMap.get(parti)+1);
        	}else {        		
        		partiMap.put(parti, 1);
        	}	
        }
        
        for(String comp : completion) {
        	if(!partiMap.containsKey(comp)) {
        		return comp;
        	}else {        		
        		partiMap.put(comp, partiMap.get(comp)-1);
        	}	
        }
        for(String key : partiMap.keySet()) {
        	if(partiMap.get(key) == 1) {
        		return key;
        	}
        }
        return answer;
    }
}