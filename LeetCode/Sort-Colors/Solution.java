1class Solution {
2    public void sortColors(int[] nums) {
3        int low=0;
4        int mid=0;
5        int high=nums.length-1;
6        while(mid<=high){
7            if(nums[mid]==0){
8                int temp=nums[mid];
9                nums[mid]=nums[low];
10                nums[low]=temp;
11                low++;
12                mid++;
13            }
14            else if(nums[mid]==1){
15                mid++;
16            }
17            else if(nums[mid]==2){
18                int temp=nums[mid];
19                nums[mid]=nums[high];
20                nums[high]=temp;
21                high--;
22            }
23        }
24        for(int i=0;i<nums.length;i++){
25            System.out.print(nums[i]);
26        }
27    }
28}