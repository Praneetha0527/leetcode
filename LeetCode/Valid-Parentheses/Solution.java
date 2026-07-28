1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        Map<Character, Character> match = Map.of(')', '(', ']', '[', '}', '{');
5        for (char c : s.toCharArray()) {
6            if (match.containsKey(c)) {
7                if (stack.isEmpty() || stack.pop() != match.get(c)) {
8                    return false;
9                }
10            } else {
11                stack.push(c);
12            }
13        }
14        return stack.isEmpty();
15    }
16}