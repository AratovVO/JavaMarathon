package day18;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = null;
    }
    public void insert(int value){
        root = addElement(value,root);
    }
    private Node addElement(int value,Node root){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value) {
            root.left = addElement(value, root.left);
        } else if(value > root.value){
            root.right = addElement(value, root.right);
        }
        return root;
    }
    public void dfs(Node root){
        if(root != null) {
            dfs(root.left);
            System.out.print(root.value + " ");
            dfs(root.right);
        }
    }
    public void inOrderTraversal(){
        dfs(root);
    }

}
