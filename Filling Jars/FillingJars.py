'''
Created on 29/07/2014

@author: miguel
'''

if __name__ == '__main__':
    
    nJars, nOperations = map(int, input().split())
    number = [0]*nJars;
    total = 0
    for i in range(nOperations):
        a, b, k = map(int, input().split())
        total += (b-a+1)*k
    print(int(total/nJars))
