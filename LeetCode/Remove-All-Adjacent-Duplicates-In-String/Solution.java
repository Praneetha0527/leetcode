1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder stack = new StringBuilder();
4        for (char c : s.toCharArray()) {
5            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c) {
6                stack.deleteCharAt(stack.length() - 1);
7            } else {
8                stack.append(c);
9            }
10        }
11        return stack.toString();
12    }
13}