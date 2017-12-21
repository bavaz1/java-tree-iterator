package com.flowacademy.treenode;

public class Main {
    public static void main(String[] args) {
        BinTreeNode root = generateTree();
        BinTreeJava tree = new BinTreeJava();


        BTreePrinter printer = new BTreePrinter();

        printer.printNode(root);
        //System.out.println(tree.search(root, 5));
        System.out.print("Mélységi bejárás:\t");
        tree.iterate(root);
        System.out.println();
        System.out.println();
        //System.out.println(tree.leavesNumber(root));
        System.out.print("Szélességi bejárás:\t");
        tree.inOrderIterate(root);

        //System.out.println(tree.numberOfElementInLevel(root, 2));

        System.out.println(tree.numberOfElements(root));
    }


    public static BinTreeNode generateTree() {
        BinTreeJava tree = new BinTreeJava();
        BinTreeNode root = tree.insertNode(null, 6);

        tree.insertNode(root, 9);
        tree.insertNode(root, 2);
        tree.insertNode(root, 6);
        tree.insertNode(root, 1);
        tree.insertNode(root, 2);
        tree.insertNode(root, 8);
        tree.insertNode(root, 5);
        tree.insertNode(root, 10);

        return root;
    }


}
