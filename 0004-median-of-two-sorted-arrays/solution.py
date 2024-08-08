class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        total = len(nums)
        if total % 2 == 1:
            return float(nums[total // 2])
        else:
            mid1 = nums[total // 2 - 1]
            mid2 = nums[total // 2]
            return (float(mid1) + float(mid2))/2.0
