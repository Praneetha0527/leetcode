1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        char res=letters[0];
4        int left=0;
5        int right=letters.length-1;
6        while(left<=right){
7            int mid=(left+right)/2;
8            if(letters[mid]<=target){
9                left=mid+1;
10            }
11            else if(letters[mid]>target){
12                res=letters[mid];
13                right=mid-1;
14            }
15        }
16        return res;
17    }
18}
19 