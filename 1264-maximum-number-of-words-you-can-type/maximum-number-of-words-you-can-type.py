class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words = text.split(" ")
        count = 0
        for word in words:
            for char in brokenLetters:
                if char in word:
                    break
            else:
                count += 1
        return count

        