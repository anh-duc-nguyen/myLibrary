class Node:
    rChild,lChild,data =None,None,None
    def __init__(self,key):
        self.rChild = None
        self.lChild = None
        self.data = key

class MyBinaryTree:
    root,size =None,0
    def __init__(self):
        self.root = None
        self.size =0
    def insert (self, node, data):
        if node is None:
            node = Node(data)
        else:
            if node.data > data:
                self.insert(node.rChild,data)
            else:
                self.insert(node.lChild,data)
    
        
def testMyBinaryTree():
    t = MyBinaryTree()
    t.root = Node(4)
    t.root.rChild = Node(5)
    t.insert(t.root,3)
    print t.root.rChild.data 

testMyBinaryTree()
