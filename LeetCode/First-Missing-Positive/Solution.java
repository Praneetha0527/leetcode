1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Set<Integer>s=new HashSet<>();
4        for(int n:nums){
5            s.add(n);
6        }
7        for(int i=1;i<nums.length+1;i++){
8            if(!s.contains(i)){
9                return i;
10            }
11        }
12        return nums.length+1;
13    }
14}