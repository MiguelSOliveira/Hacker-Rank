'''
Created on 29/07/2014

@author: miguel
'''

if __name__ == '__main__':
    
    def sherlock(n):
        digits = n;
        threes = 0
        fives = 0
        while(digits > 0):
            if(digits % 3 == 0):
                fives = digits
                break
            digits -= 5
        if(digits < 0 or threes % 5 != 0):
            return -1
        threes = n-digits;
        fiveList = [5] * fives
        threeList = [3] * threes
        return "".join(str(x) for x in (fiveList + threeList))
                
    nCases = int(input())
    for i in range(nCases):
        n = int(input())
        print(sherlock(n))