class State{
    int r,c,energy,mask;
    State(int r, int c, int energy, int mask){
        this.r = r;
        this.c = c;
        this.energy = energy;
        this.mask = mask;
    }
}
class Solution {
    public int minMoves(String[] clas, int energy) {
        int rows = clas.length;
        int col = clas[0].length();
        int[] ind_s = new int[2];
        List<int[]> litter = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(clas[i].charAt(j) == 'S'){
                    ind_s[0] = i;
                    ind_s[1] = j;
                }
                if(clas[i].charAt(j) == 'L'){
                    litter.add(new int[] {i,j});
                }
            }
        }
        int l_count = litter.size();
        int allclean = (1 << l_count) - 1;
        Queue<State> q = new LinkedList<>();
        q.offer(new State(ind_s[0],ind_s[1],energy,0));
        int moves = 0;
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        int[][][] visited = new int[rows][col][1 << l_count];
        for(int[][] a : visited){
            for(int[] b : a){
                Arrays.fill(b,-1);
            }
        }
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                State cur = q.poll();
                if(cur.mask == allclean){
                    return moves;
                }
                for(int d = 0; d < 4; d++){
                    int nr = cur.r + dr[d];
                    int nc = cur.c + dc[d];
                    if(nr >= rows || nc >= col || nr < 0 || nc < 0){
                        continue;
                    }
                    if(clas[nr].charAt(nc) == 'X'){
                        continue;
                    }
                    if(cur.energy == 0){
                        continue;
                    }
                    int newEnergy = cur.energy - 1;
                    if(clas[nr].charAt(nc) == 'R'){
                        newEnergy = energy;
                    }
                    int newMask = cur.mask;
                    if(clas[nr].charAt(nc) == 'L'){
                        for(int i = 0; i < l_count; i++){
                            if(litter.get(i)[0] == nr && litter.get(i)[1] == nc){
                                newMask = newMask | (1 << i);
                            }
                        }
                    }
                    if(newEnergy <= visited[nr][nc][newMask]){
                        continue;
                    }
                    visited[nr][nc][newMask] = newEnergy;
                    q.offer(new State(nr,nc,newEnergy,newMask));
                }
            }
            moves++;
        }
        return -1;
    }
}