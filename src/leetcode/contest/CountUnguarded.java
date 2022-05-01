package leetcode.contest;

import java.util.HashSet;

public class CountUnguarded {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] area = new int[m][n];
        for(int i = 0; i < walls.length; i++){
            area[walls[i][0]][walls[i][1]] = 5;
        }
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i = 0; i < guards.length; i++){
            rows.add(guards[i][0]);
            cols.add(guards[i][1]);
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(area[i][j] == 5) break;
                if(rows.contains(i)){
                    area[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(area[j][i] == 5) break;
                if(cols.contains(i)){
                    area[j][i] = 1;
                }
            }
        }
        int count=0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(area[i][j]==0){
                    count++;
                }
            }
        }
        return count;

    }
}
