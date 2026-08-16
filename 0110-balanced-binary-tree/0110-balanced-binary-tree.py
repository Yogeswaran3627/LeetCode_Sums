class Solution(object):
    def isBalanced(self, root):
        def f(n):
            if not n:
                return 0
            l=f(n.left)
            if l==-1:
                return -1
            r=f(n.right)
            if r==-1:
                return -1
            if abs(l-r)>1:
                return -1
            return max(l,r)+1
        return f(root)!=-1