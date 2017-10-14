'''
A Class implement AVL Tree:
An Binary Tree that splay the data when ever
to keep it balance
'''
class Node:
      def __init__(self,val,bal):
            self.l = None
            self.r = None
            self.v = val
            self.b = bal
class AVL:
      def __init__(self):
            self.root = None
            self.size = 0
      
