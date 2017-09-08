import numpy as np
import playFairCipher as pfc
import hillCipher as hil
def main():
    exe = input('please enter task (0 to Playfair Cipher, 1 for Hill Cipher): ')

    if exe == 0:
        pfc.main()
        return

    if exe == 1:
        hil.main()
        return
    
    key ='anh'
    m = pfc.makeMatrix(key)
    cipherList = []
    lines = open("passwords.txt",'r')
    for line in lines:
        line =  line.strip('\n').strip(' ')
        cipherList.append(pfc.cipher(line,m))
    

    
main()

