class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        def t(node):
            if not node:
                return
            res.append(node.val)
            t(node.left)
            t(node.right)
        t(root)
        return res