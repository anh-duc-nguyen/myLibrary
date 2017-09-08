import numpy as np
import math

key  = np.array([6,24,1,13,16,10,20,17,15])
key  = key.reshape(3,3)

def main():
    plainText = raw_input("please enter Plain Text: ")
    cipherText = cipher (plainText, key)
    print "your cipherText is: ", cipherText 

def cipher(plainText, m):
    #plainText = plainText.lower().strip(' ')
    ALP ='abcdefghijklmnopqrstuvwxyz'
    cipherText =''
    plainM = np.array([],int)
    
    k = int(math.sqrt(m.size))

    for i in range( k- (len(plainText)%k)):
        plainText += 'x'

    for i in range(0,len(plainText),k):
        curBlock =''
        for j in range(k):
            curBlock += plainText[j+i]
        curBlock = toNum(curBlock)

        for char in plainText:
            i = ALP.index(char)
            plainM = np.append(plainM,[i])

        
        curBlock = m.dot(curBlock)
        curBlock = curBlock % 26
        for i in curBlock:
            cipherText += ALP[i]
            
    return cipherText

def toNum(aBlock):
    ALP = 'abcdefghijklmnopqrstuvwxyz'
    returnArray = []
    for char in aBlock:
        returnArray.append(ALP.index(char))
    returnArray = np.array(returnArray)
    return returnArray

