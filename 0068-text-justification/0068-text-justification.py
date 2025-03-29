from typing import List

class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        res = []
        line, length = [], 0
        i = 0
        
        while i < len(words):
            # Check if the current word can fit in the current line
            if length + len(line) + len(words[i]) > maxWidth:
                # Line complete, need to justify it
                extra_space = maxWidth - length
                if len(line) == 1:  # If there's only one word in the line
                    res.append(line[0] + " " * extra_space)
                else:
                    spaces = extra_space // (len(line) - 1)  # Base spaces between words
                    remainder = extra_space % (len(line) - 1)  # Extra spaces to distribute
                    
                    for j in range(len(line) - 1):
                        line[j] += " " * (spaces + (1 if j < remainder else 0))  # Distribute extra spaces
                    
                    res.append("".join(line))  # Join words into a single line
                line, length = [], 0  # Reset for next line
                
            # Add the current word to the line
            line.append(words[i])
            length += len(words[i])
            i += 1
        
        # Handle the last line, it should be left-justified
        last_line = " ".join(line)
        trail_space = maxWidth - len(last_line)
        res.append(last_line + " " * trail_space)
        
        return res
