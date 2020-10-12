package bigone.programmers.stackqueue;

import java.util.*;

class TruckBridge {
    static Queue<Integer> bridge;
    static int time = 0;
    static int sumWeight;

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        bridge = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            while (true)
            {
                if (bridge.isEmpty())
                {
                    bridge.offer(truck_weights[i]);
                    sumWeight += truck_weights[i];
                    time++;
                    break;
                }
                else if (bridge.size() == bridge_length)
                {
                    sumWeight -= bridge.poll();
                }
                else
                {
                    if (sumWeight + truck_weights[i] > weight)
                    {
                        bridge.offer(0);
                        time++;
                    }
                    else
                    {
                        bridge.offer(truck_weights[i]);
                        sumWeight += truck_weights[i];
                        time++;
                        break;
                    }
                }
            }
        }

        time = time + bridge_length;

        return time;
    }
}
