'''
Created on 29/07/2014

@author: miguel
'''
from fractions import gcd

if __name__ == '__main__':
    
    def findAnswer(numbersForArray):
        for i in range(1, len(numbersForArray)):
            for j in range(1, len(numbersForArray)):
                if(i < j and i != j):
                    if(gcd(numbersForArray[i], numbersForArray[j]) == 1):
                        return "YES"
        return "NO"
    
    nCases = int(input())
    for _ in range(nCases):
        input()
        numbersForArray = map(int, input().split())
        print(findAnswer(list(numbersForArray)))