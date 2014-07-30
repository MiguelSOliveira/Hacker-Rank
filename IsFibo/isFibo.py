'''
Created on 30/07/2014

@author: miguel
'''

if __name__ == '__main__':
    
    nNumbers = int(input())
    fibs = [1,1,1]
    for i in range(nNumbers):
        number = int(input())
        if(fibs[2] > number):
            fibs = [1,1,1]
        while(fibs[2] < number):
            fibs[2] = fibs[0] + fibs[1]
            fibs = [fibs[1], fibs[2], fibs[2]]
        if(fibs[2] == number):
            print('IsFibo')
        else: print('IsNotFibo')