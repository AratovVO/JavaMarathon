package day18;

import java.sql.SQLOutput;

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
        if(value < root.value){
            root.left = addElement(value, root.left);
        } else if(value > root.value){
            root.right = addElement(value, root.right);
        }
        return root;
    }
    public void printTree(BinaryTree tree){
        if(root.left == null && root.right == null){
            System.out.println(root.value);
        }
        int copyValue = root.value;
        if(root.left.value < root.value){

        }
    }
}
