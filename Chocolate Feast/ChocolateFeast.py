'''
Created on 25/07/2014

@author: miguel

    Sample input
    3
    10 2 5
    12 4 4
    6 2 2

    Sample Output
    6
    3
    5

'''

if __name__ == '__main__':
    T = int(raw_input())
    for i in range (0,T):
        money, cost, wrappers = [int(x) for x in raw_input().split(' ')]
    
        answer = 0
        answer =  money / cost
        total = money / cost
        while(answer >= wrappers):
            extra = answer / wrappers
            answer = extra + (answer % wrappers)
            total += extra
        print(total)
