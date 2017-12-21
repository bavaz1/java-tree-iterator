package com.flowacademy.treenode;

public class BinTreeNode {
    private BinTreeNode left;
    private BinTreeNode right;
    private int value;

    public BinTreeNode(BinTreeNode left, BinTreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinTreeNode left) {
        this.left = left;
    }

    public BinTreeNode getRight() {
        return right;
    }

    public void setRight(BinTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value: " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinTreeNode that = (BinTreeNode) o;

        if (value != that.value) return false;
        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        return right != null ? right.equals(that.right) : that.right == null;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        result = 31 * result + value;
        return result;
    }
}
