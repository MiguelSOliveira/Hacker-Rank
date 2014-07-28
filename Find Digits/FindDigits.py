'''
Created on 28/07/2014

@author: miguel
'''

if __name__ == '__main__':
    
    nTests = int(input())
    for i in range(nTests):
        number = input()
        count = 0
        for j in range(len(number)):
            if(int(number[j]) == 0): pass
            elif(int(number) % int(number[j]) == 0): count += 1
        print(count)