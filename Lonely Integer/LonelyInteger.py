'''
Created on 08/08/2014

@author: miguel
'''
if __name__ == '__main__':

    def lonelyinteger(a):
        a = sorted(a)
        if(len(a) == 1):
            return a[0]
        
        elif(a[len(a)-1] != a[len(a)-2]):
            return a[len(a)-1]
        
        elif(a[0] != a[1]):
            return a[0]
        k = 1
        while(k < len(a)-1):
            if(a[k] != a[k-1] and a[k] != a[k+1]):
                return a[k]
            k+=1
        
    a = int(input())
    b = map(int, input().split(" "))
    print(lonelyinteger(b))