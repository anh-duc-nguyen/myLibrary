import numpy as np
def main():
    key = raw_input("Please enter a key: ")
    plainText = raw_input("Please enter plain text:")
    m = makeMatrix(key)
    cipherText = cipher(plainText,m)
    print 'your cipherText is: ',cipherText
def cipher(plainText, m):
    plainText = plainText.lower()
    plainText = plainText.replace('j','i')
    if len(plainText)%2 == 1:
        plainText+='x'
    cipherText =''
    #print(m)
    for i in range(0,len(plainText),2):
        first= plainText[i]
        second = plainText[i+1]
        pair = subtitute(m,first,second)
        cipherText += pair
    return cipherText

def subtitute(m,first,second):
    for row in m:
        row1=[]
        if first in row and second in row:
            row1 = np.append(row,row[0])
            first = row1[np.where(row == first)[0][0]+1]
            second = row1[np.where(row == second)[0][0]+1]
            pair = first+second
            return pair
    for col in m.T:
        col1=[]
        if first in col and second in col:
            col1 = np.append(col,col[0])
            first = col1[np.where(col == first)[0][0]+1]
            second = col1[np.where(col == second)[0][0]+1]
            pair = first+second
            return pair
    
    Posi =  np.where(m == first)
    firstPosi = (Posi[0][0],Posi[1][0])
    Posi= np.where(m == second)
    secondPosi= (Posi[0][0],Posi[1][0])
    pair = m[firstPosi[0],secondPosi[1]] + m[secondPosi[0],firstPosi[1]]
    return pair

def makeMatrix(key):
    ALP = 'abcdefghiklmnopqrstuvwxyz'
    key = key.lower()
    key = key.replace("j","i")
    key = ''.join([j for i, j in enumerate(key) if j not in key[:i]])
    
    m = np.array([])

    for char in key:
        if char in ALP:
            ALP = ALP.replace(char,'')
        m = np.append(m,char)
    for char in ALP:
        m = np.append(m,char)
    m = m.reshape(5,5)
    return m

