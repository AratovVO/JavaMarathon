package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        BinaryTree bt = new BinaryTree(root);
        bt.insert(14);
        bt.insert(16);
        bt.insert(15);
        bt.insert(18);
        bt.insert(11);
        bt.insert(5);
        bt.insert(8);
        bt.insert(23);
        bt.insert(22);
        bt.insert(27);
        bt.insert(24);
        bt.insert(150);
        bt.inOrderTraversal();
    }
}