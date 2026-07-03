1class Solution {
2    public boolean isHappy(int n) {
3        while (n != 1 && n != 4) {
4            int sum = 0;
5            while (n > 0) {
6                int digit = n % 10;
7                sum += digit * digit;
8                n /= 10;
9            }
10            n = sum;
11        }
12
13        return n == 1;
14    }
15}