1class Solution {
2    public void rotate(int[][] n) {
3        for(int i=0;i<n.length;i++){
4            for(int j=i+1;j<n.length;j++){
5                int temp=n[i][j];
6                n[i][j] = n[j][i];
7                n[j][i] = temp;
8            }
9        }
10        for(int i=0;i<n.length;i++){
11            for(int j=0;j<n.length/2;j++){
12                int temp = n[i][j];
13                n[i][j] = n[i][n.length-1-j];
14                n[i][n.length-1-j]=temp;
15            }
16        }
17    }
18}