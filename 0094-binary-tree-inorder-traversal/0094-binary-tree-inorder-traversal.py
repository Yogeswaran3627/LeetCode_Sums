class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        def t(node):
            if not node:
                return
            t(node.left)
            res.append(node.val)
            t(node.right)
        t(root)
        return res