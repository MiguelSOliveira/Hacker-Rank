'''
Created on 24/07/2014

@author: miguel
'''
from __future__ import print_function
import sys


if __name__ == '__main__':
    
    numberOfTests = int(input())
    letters = []
    for i in range(ord('a'), ord('z')+1):
        letters.append(chr(i))
        
    for i in range(numberOfTests):
        nextSet = sys.stdin.readline()
        nextSet = set(nextSet)
        for j in range(0, len(letters)):
            if not letters[j] in nextSet:
                letters[j] = None
        letters = filter(None, letters)
    print(len(letters))