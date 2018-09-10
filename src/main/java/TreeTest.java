class TreeNode{
    int body;
    TreeNode left;
    TreeNode right;
    TreeNode(int t)
    {
        body = t;
    }
}

class Tree
{
    void add(TreeNode root, TreeNode n1){
        while(true)
        {
            if(root.body >= n1.body)
            {
                if(root.left!=null)
                {
                    root = root.left;
                }
                else
                {
                    root.left = n1;
                    break;
                }
            }
            else
            {
                if(root.right!=null)
                {
                    root = root.right;
                }
                else
                {
                    root.right = n1;
                    break;
                }
            }
        }
    }

    void print(TreeNode root)
    {
        if (root==null)
            return;
        print(root.left);
        System.out.println(root.body);
        print(root.right);

    }
}

class AVLTree extends Tree{
    @Override
    void add(TreeNode root, TreeNode n1){

    }
}
public class TreeTest {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        Tree tree = new Tree();
        tree.add(t1, new TreeNode(13));
        tree.add(t1, new TreeNode(1));
        tree.add(t1, new TreeNode(19));
        tree.add(t1, new TreeNode(1120));
        tree.print(t1);
    }
}
