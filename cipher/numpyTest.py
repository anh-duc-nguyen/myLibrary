import numpy as np
a = np.array([[1,2,3],[4,5,6],[7,8,9]])
i = 6
position = np.where(a == i)
tupp = ((position[0][0]),(position[1][0]))
print(tupp)
j = a[tupp[1] ,tupp[0]]
print(j)


a = np.array([1,2,3,4,5])
print ( np.where(a==2)[0][0])
