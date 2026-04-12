logest substring without repeating 
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        s1=set()
        left=0
        max1=0
        for right in range(len(s)):
            while s[right] in s1:
                s1.remove(s[left])
                left+=1
            s1.add(s[right])
            max1=max(max1,right-left+1)
        return max1
