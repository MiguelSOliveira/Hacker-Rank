'''
Created on 25/07/2014

@author: miguel

    Sample Input #00
    
    3
    abc
    abcba
    abcd
    Sample Output #00
    
    2
    0
    4
    Explanation
    
    For the first test case, ab*c* -> ab*b* -> ab*a*. 
    For the second test case, abcba is a palindromic string. 
    For the third test case, abc*d* -> abc*c* -> abc*b* -> abc*a* = ab*c*a -> ab*b*a.


'''

if __name__ == '__main__':
    
    nTests = int(raw_input())
    for i in range(nTests):
        sentence = raw_input()
        count = 0
        for j, n in zip(range(len(sentence)/2), range(len(sentence)-1, -1, -1)):
            count += abs((ord(sentence[n]) - ord(sentence[j])))
        print(count)
            
            
            
            
            