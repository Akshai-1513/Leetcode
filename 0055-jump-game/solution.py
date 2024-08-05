class Solution:
    def canJump(self, nums: List[int]) -> bool:
        temp = 0
        for i in nums:
            if temp < 0:
                return False
            elif i > temp:
                temp = i
            temp -= 1
        return True        
