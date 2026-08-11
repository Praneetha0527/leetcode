1class Solution {    
2    public int findLength(int[] nums1, int[] nums2) {
3        int n= nums1.length;
4        int m= nums2.length;
5        int ans=0;
6        int dp[][]= new int[n+1][m+1];
7        for(int i=1;i<=n;i++)
8            for(int j=1;j<=m;j++){
9                if(nums1[i-1]==nums2[j-1] ){
10                    dp[i][j]= 1+ dp[i-1][j-1];
11                    ans=Math.max (ans,dp[i][j] );
12                } 
13                else dp[i][j]=0;
14            }
15        return ans;
16    }
17}