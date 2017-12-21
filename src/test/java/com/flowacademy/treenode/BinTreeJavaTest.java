package com.flowacademy.treenode;

import org.junit.jupiter.api.Test;

import static com.flowacademy.treenode.Main.generateTree;
import static org.junit.jupiter.api.Assertions.*;

class BinTreeJavaTest {
    BinTreeNode root = generateTree();
    BinTreeJava tree = new BinTreeJava();

    BinTreeNode testNode = new BinTreeNode(null, null, 5);
    BinTreeJava emptyTree = new BinTreeJava();


    @Test
    void leavesNumber() {
        assertEquals(4, tree.leavesNumber(root));
    }

    @Test
    void leavesNumberFail() {
        assertNotEquals(0, tree.leavesNumber(root));
    }

    @Test
    void search() {
        assertEquals(testNode.getValue(), tree.search(root, 5).getValue());
    }

    @Test
    void insertFail() {
        assertNotNull(tree.insertNode(root, 12));
    }

    @Test
    void insert() {
        tree.insertNode(root, 5);
        assertEquals(10, tree.numberOfElements(root));
    }

    @Test
    void objectEquals() {
        assertEquals(testNode, tree.search(root, testNode.getValue()));
    }

    @Test
    void elementInLevel() {
        assertEquals(4, tree.numberOfElementInLevel(root, 2));
    }

    @Test
    void elementNumberInTree() {
        assertEquals(9, tree.numberOfElements(root));
    }

    @Test
    void deleteEmptyTree() {
        tree.delete(root);
        assertEquals(1, tree.numberOfElements(root));
    }

}