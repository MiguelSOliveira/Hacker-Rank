'''
Created on 25/07/2014

@author: miguel

    Sample Input : 01
    
    aaabbbb
    Sample Output : 01
    
    YES
    Explanation 
    A palindrome permutation of the given string is bbaaabb. 
    
    Sample Input : 02
    
    cdefghmnopqrstuvw
    Sample Output : 02
    
    NO
    Explanation 
    You can verify that the given string has no palindrome permutation. 
    
    Sample Input : 03
    
    cdcdcdcdeeeef
    Sample Output : 03
    
    YES

'''
import sys
if __name__ == '__main__':
    
    code = raw_input()
    codeSet = list(set(code))
    count = [0]*len(codeSet)
    j = 0
    counter = 0
    for i in range(len(codeSet)):
        for j in range(len(code)):
            if codeSet[i] == code[j]:
                count[i] += 1
        if(len(code) % 2 == 0):
            if count[i] % 2 != 0:
                print('NO')
                sys.exit(0)
        else:
            if count[i] % 2 != 0:
                counter += 1
                if counter > 1:
                    print('NO')
                    sys.exit(0)
    print('YES')
    
    
    
        
    