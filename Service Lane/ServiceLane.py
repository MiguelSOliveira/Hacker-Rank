'''
Created on 24/07/2014

@author: miguel

    Sample Input #00
    
    8 5
    2 3 1 2 3 2 3 3
    0 3
    4 6
    6 7
    3 5
    0 7
    Sample Output #00
    
    1
    2
    3
    2
    1

'''
import sys


if __name__ == '__main__':
    
    lengthFreeway, numberOfCases = map(int, sys.stdin.readline().split())
    nextLane = str(sys.stdin.readline())
    lane = list("".join(nextLane).split())
    for i in range(numberOfCases):
        enterLane, exitLane = map(int, sys.stdin.readline().split())
        minLane = 3
        for j in range(enterLane, exitLane+1):
            minLane = min(int(lane[j]), minLane)
        print(minLane)
                
















