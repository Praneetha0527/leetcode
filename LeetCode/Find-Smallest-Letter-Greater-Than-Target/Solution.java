1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3       for(char n:letters){
4            if(n>target){
5                return n;
6            }
7        }
8        return letters[0];
9    }
10}
11 