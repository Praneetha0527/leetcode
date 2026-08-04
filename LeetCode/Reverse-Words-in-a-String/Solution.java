1class Solution(object):
2    def reverseWords(self, s):
3        """
4        :type s: str
5        :rtype: str
6        """
7        words = s.split()
8        
9        reversed_words = words[::-1]
10        
11        reversed_string = ' '.join(reversed_words)
12        
13        return reversed_string