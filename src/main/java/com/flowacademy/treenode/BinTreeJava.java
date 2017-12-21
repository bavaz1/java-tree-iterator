package com.flowacademy.treenode;

import java.util.LinkedList;

public class BinTreeJava {
    private static LinkedList<BinTreeNode> lista = new LinkedList<>();


    public BinTreeNode insertNode(BinTreeNode root, Integer value) {
        if (root == null) {
            return new BinTreeNode(null, null, value);
        } else if (root.getValue() >= value) {
            root.setLeft(insertNode(root.getLeft(), value));
            return root;
        } else if (root.getValue() < value) {
            root.setRight(insertNode(root.getRight(), value));
            return root;
        } else {
            return root;
        }
    }

    public BinTreeNode search(BinTreeNode root, Integer value) {
        if (root == null) {
            return root;
        } else if (root.getValue() != value) {
            if (root.getValue() > value) {
                root = search(root.getLeft(), value);
            } else if (root.getValue() < value) {
                root = search(root.getRight(), value);
            } else {
                return root;
            }
        }
        return root;
    }

    public BinTreeNode iterate(BinTreeNode root) {
        if (root == null) {
            return root;
        } else {
            System.out.print(root + " ");
            if (root.getLeft() != null) {
                iterate(root.getLeft());
            }
            if (root.getRight() != null) {
                iterate(root.getRight());
            }
        }
        return root;
    }

    public int leavesNumber(BinTreeNode root) {
        int leavesCounter = 0;
        if (root == null) {
            return 0;
        } else {
            if (root.getRight() == null && root.getLeft() == null) {
                return 1;
            } else {
                leavesCounter = (leavesNumber(root.getLeft()) + leavesNumber(root.getRight()));
            }
        }
        return leavesCounter;
    }

    public int numberOfElementInLevel(BinTreeNode root, int level) {
        if (root == null) {
            return 0;
        } else if (level == 0) {
            return 1;
        } else {
            return numberOfElementInLevel(root.getRight(), level - 1) + numberOfElementInLevel(root.getLeft(), level - 1);
        }
    }

    public int numberOfElements(BinTreeNode root) {
        if (root == null) {
            return 0;

        } else {
            return numberOfElements(root.getRight()) + numberOfElements(root.getLeft()) + 1;
        }
    }

    public void delete(BinTreeNode root) {
        if (root == null) {
            System.out.println("A fa üres!");
        } else {
            if (root.getLeft() != null) {
                delete(root.getLeft());
            }
            if (root.getRight() != null) {
                delete(root.getRight());
            }
            root.setLeft(null);
            root.setRight(null);
            root.setValue(0);
        }
    }

    public BinTreeNode inOrderIterate(BinTreeNode root) {
        if (lista.size() > 0) {
            lista.remove(0);
        }
        if (root == null) {
            return root;
        } else {
            if (root.getLeft() != null) {
                lista.add(root.getLeft());
            }
            if (root.getRight() != null) {
                lista.add(root.getRight());
            }
            if (lista.size() != 0) {
                inOrderIterate(lista.get(0));
            }
        }
        System.out.print(root + " ");
        return root;
    }
}
