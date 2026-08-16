class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        def t(node):
            if not node:
                return
            t(node.left)
            t(node.right)
            res.append(node.val)
        t(root)
        return res