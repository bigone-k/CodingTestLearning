package bigone.programmers.hash;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        CAlbum pl_Album;
        ArrayList<CAlbum> pl_ArrAlbum = new ArrayList<>();
        ArrayList<Integer> pl_Result = new ArrayList<>();
        HashMap<String, CAlbum> bestAlbums = new HashMap<>();

        // Step 1
        for (int i = 0; i < genres.length; i++) {
            if (bestAlbums.containsKey(genres[i])) {

                bestAlbums.get(genres[i]).TotalPlayCnt += plays[i];

                if (bestAlbums.get(genres[i]).Top1Play < plays[i]) {
                    int tempPlay = bestAlbums.get(genres[i]).Top1Play;
                    int tempIdx = bestAlbums.get(genres[i]).Top1Index;

                    bestAlbums.get(genres[i]).Top1Play = plays[i];
                    bestAlbums.get(genres[i]).Top1Index = i;

                    if (bestAlbums.get(genres[i]).Top2Play < tempPlay) {
                        bestAlbums.get(genres[i]).Top2Play = tempPlay;
                        bestAlbums.get(genres[i]).Top2Index = tempIdx;
                    }
                } else {
                    if (bestAlbums.get(genres[i]).Top2Play < plays[i]) {
                        bestAlbums.get(genres[i]).Top2Play = plays[i];
                        bestAlbums.get(genres[i]).Top2Index = i;
                    }
                }

            } else {
                pl_Album = new CAlbum(plays[i], plays[i], i, -1, -1);

                bestAlbums.put(genres[i], pl_Album);
            }
        }

        // Step 2
        for (String key : bestAlbums.keySet()) {
            pl_ArrAlbum.add(bestAlbums.get(key));
        }

        Collections.sort(pl_ArrAlbum);

        // Step 3
        for (int j = 0; j < pl_ArrAlbum.size(); j++) {
            if (pl_ArrAlbum.get(j).Top1Index >= 0) {
                pl_Result.add(pl_ArrAlbum.get(j).Top1Index);
            }

            if (pl_ArrAlbum.get(j).Top2Index >= 0) {
                pl_Result.add(pl_ArrAlbum.get(j).Top2Index);
            }
        }

        answer = new int[pl_Result.size()];

        for (int k = 0; k < pl_Result.size(); k++) {
            answer[k] = pl_Result.get(k);
        }

        return answer;
    }

    public class CAlbum implements Comparable<CAlbum> {
        int TotalPlayCnt = 0;
        int Top1Play = 0;
        int Top2Play = 0;
        int Top1Index = 0;
        int Top2Index = 0;

        public CAlbum(int TotalPlayCnt, int Top1Play, int Top1Index, int Top2Play, int Top2Index) {
            this.TotalPlayCnt = TotalPlayCnt;
            this.Top1Play = Top1Play;
            this.Top1Index = Top1Index;
            this.Top2Play = Top2Play;
            this.Top2Index = Top2Index;
        }

        @Override
        public int compareTo(CAlbum o) {
            int temp_totalCnt = ((CAlbum) o).TotalPlayCnt;

            return temp_totalCnt - this.TotalPlayCnt;
        }
    }
}
