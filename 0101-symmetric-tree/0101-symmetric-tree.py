class Solution(object):
    def isSymmetric(self, root):
        if not root:
            return True
        return self.Check(root.left, root.right)
    def Check(self, t1, t2):
        if not t1 and not t2:
            return True
        if not t1 or not t2 or t1.val != t2.val:
            return False        
        return self.Check(t1.left, t2.right) and self.Check(t1.right, t2.left)