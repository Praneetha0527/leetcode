1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int min=nums[0];
4        int max=nums[0];
5        Set<Integer>set=new HashSet<>();
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]<min){
8                min=nums[i];
9            }
10            if(nums[i]>max){
11                max=nums[i];
12            }
13            set.add(nums[i]);
14        }
15        List<Integer>res=new ArrayList<>();
16        for(int i=min;i<max;i++){
17            if(!set.contains(i)){
18                res.add(i);
19            }
20        }
21        return res;
22    }
23}