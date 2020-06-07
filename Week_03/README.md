## 学习笔记

### 236.二叉树的最近公共祖先
由于题目中说一个节点可以是它自己的祖先，我们先求出左子树的最近公共祖先和右子树的最近公共祖先<br>
TreeNode left = lowestCommonAncestor(root.left, p, q);<br>
TreeNode right = lowestCommonAncestor(root.right, p, q);<br>
如果left和right为null，说明p和q并不存在公共祖先，返回null<br>
如果left==null,right!=nulll,说明其公共祖先就是right<br>
如果right==null,left!=null,说明其公共祖先就是left<br>
都不为null,说明left==right==root,返回root.<br>

### 105.从前序与中序遍历序列构造二叉树<br>
前序遍历形式：<br>
[根节点,[左子树的前序遍历结果],[右子树的前序遍历结果]]<br>
preLeft,preLeft+1,pIndex-inLeft+preLeft,pIndex-inLeft+preLeft+1,preRight<br>
中序遍历形式：<br>
[[左子树的中序遍历结果],根节点,[右子树的中序遍历结果]]<br>
inLeft,pIndex-1,pIndex,pIndex+1,inRight<br>