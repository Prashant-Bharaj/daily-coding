package leetcode.contest;

import java.util.HashMap;

public class MinimumCardPickup {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int mx = 0;
        for(int i = 0; i < cards.length; i++){
            if(hm.containsKey(cards[i])){
                mx = Math.max(mx, i - hm.get(cards[i]) +1);
                hm.put(cards[i], i);
            } else {
                hm.put(cards[i], i);
            }
        }
        return mx;
    }
}
