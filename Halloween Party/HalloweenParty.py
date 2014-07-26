'''
Created on 25/07/2014

@author: miguel

    Exemplo de Entrada #00
    
    4
    5
    6
    7
    8
    Exemplo de Saida #00
    
    6
    9
    12
    16

'''

if __name__ == '__main__':
    
    nTests = int(raw_input())
    
    for i in range(nTests):
        k = int(raw_input())
        sum = 2
        count = 0
        counter = 2
        for j in range(3, k):
            count += 1
            sum += counter
            if count == 2:
                counter += 1
                count = 0
        print(sum)
            
            
            
            
            
            
            
            
            
            