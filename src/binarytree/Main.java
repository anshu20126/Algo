package binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode N1 = new BinaryNode();
        N1.value="N1";
        BinaryNode N2 = new BinaryNode();
        N1.value="N2";
        BinaryNode N3 = new BinaryNode();
        N1.value="N3";
        BinaryNode N4 = new BinaryNode();
        N1.value="N4";
        BinaryNode N5 = new BinaryNode();
        N1.value="N5";
        BinaryNode N6 = new BinaryNode();
        N1.value="N6";
        BinaryNode N7 = new BinaryNode();
        N1.value="N7";
        BinaryNode N8 = new BinaryNode();
        N1.value="N8";
        BinaryNode N9 = new BinaryNode();
        N1.value="N9";

        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N3;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;
        binaryTree.root=N1;

        binaryTree.search("N10");

    }
}
