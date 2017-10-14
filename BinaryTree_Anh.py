'''
A Class BinarySearchTree implement binary Tree
@author : Dijra (http://stackoverflow.com/users/2805357/djra)
@author : Anh Nguyen
@version: Nov 15 - 2016
'''

class Node:
    def __init__(self, val):
        self.l = None
        self.r = None
        self.v = val
    def getVal(self):
        return self.v

class BST:
    def __init__(self):
        self.root = None
        self.size = 0
    
    def getRoot(self):
        return self.root
    def getSize(self):
        return self.size
    def isEmpty(self):
        return self.size == 0

    def insert(self, val):
        self.size += 1
        if self.root == None:
            self.root = Node(val)
        else:
            self._insert(val, self.root)

    def _insert(self, val, node):
        if val < node.v:
            if node.l is not None:
                self._insert(val, node.l)
            else:
                node.l = Node(val)
        else:
            if node.r is not None:
                self._insert(val, node.r)
            else:
                node.r = Node(val)
                
    def contain(self, val):
        if self.root is not None:
            return self._contain(val, self.root)
        else:
            return False

    def _contain(self, val, node):
        if val == node.v:
            return True
        elif val > node.v and node.r is not None:
            return self._contain(val, node.r)
        elif val < node.v and node.l is not None:
            return self._contain(val, node.l)
        return False
    def findMax(self):
        if self.root is None:
            return None
        else:
            return self._findMax(self.root)
    def _findMax(self,node):
        if node.l is None:
            return node.v
        else:
            return _findMax(node.l)

    def deleteTree(self):
        self.root = None
        self.size = 0

    def toString(self):
        if self.root != None:
            self._toString(self.root)

    def _toString(self, node):
        if node is not None:
            self._toString(node.l)
            print (str(node.v) + ' ')
            self._toString(node.r)
