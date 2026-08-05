1import java.util.*;
2
3public class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        Arrays.sort(nums);
6        List<List<Integer>> result = new ArrayList<>();
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            if (i > 0 && nums[i] == nums[i - 1]) continue;
10
11            int left = i + 1, right = nums.length - 1;
12
13            while (left < right) {
14                int sum = nums[i] + nums[left] + nums[right];
15
16                if (sum == 0) {
17                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
18
19                    while (left < right && nums[left] == nums[left + 1]) left++;
20                    while (left < right && nums[right] == nums[right - 1]) right--;
21
22                    left++;
23                    right--;
24                } else if (sum < 0) {
25                    left++;
26                } else {
27                    right--;
28                }
29            }
30        }
31
32        return result;
33    }
34}