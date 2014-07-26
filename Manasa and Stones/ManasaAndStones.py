'''
Created on 27/07/2014

@author: miguel
'''

if __name__ == '__main__':
    
    nTests = int(raw_input())
    set = set()
    for i in range(nTests):
        nRocks = int(raw_input())
        a = int(raw_input())
        b = int(raw_input())
        for j in range(nRocks):
            set.add(b*j + (nRocks-j-1)*a)
        print(" ".join(str(s) for s in sorted(set)))
        set.clear()