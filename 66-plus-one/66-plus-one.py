class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        a = int("".join(map(str, digits)))
        b = list(map(int, str(a+1)))
        return b
    
    
# my logic -

# 1) convert list of integers into single integers
# 2) then add 1 to the number and then convert it again to list
