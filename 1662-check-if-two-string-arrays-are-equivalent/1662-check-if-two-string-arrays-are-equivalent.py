class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        temp = ""
        temp2 = ""
        for i in word1:
            temp+=i
            
        for j in word2:
            temp2+=j
        
        if temp == temp2:
            return True
        else:
            return False;