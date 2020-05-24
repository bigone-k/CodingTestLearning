package bigone.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnfulfilledPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<Integer, String> participantMap = new HashMap<Integer, String>();
        int index = 0;

        Arrays.sort(participant);
        for(String part : participant) {
            if (!participantMap.containsKey(part))
                participantMap.put(index++, part);
        }

        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
            if (!participantMap.get(i).equals(completion[i])) {
                answer = participantMap.get(i);
                break;
            }
        }

        return answer;
    }
}
