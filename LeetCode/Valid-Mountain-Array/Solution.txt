1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        if(arr.length<3){
4            return false;
5        }
6        int index=0;
7        for(int i=1;i<arr.length;i++){
8            if(arr[i]>arr[index]){
9                index=i;
10            }
11        }
12        if(index==0 || index==arr.length-1){
13            return false;
14        }
15        for(int i=0;i<index;i++){
16            if(arr[i]>=arr[i+1]){
17                return false;
18            }
19        }    
20        for(int i=index;i<arr.length-1;i++){
21            if(arr[i]<=arr[i+1]){
22                return false;
23            }
24        }
25        return true;
26    }
27}