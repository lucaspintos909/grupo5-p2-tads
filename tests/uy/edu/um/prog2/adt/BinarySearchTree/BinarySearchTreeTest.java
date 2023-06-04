package uy.edu.um.prog2.adt.BinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    BinarySearchTree tree = new BinarySearchTree();

    @Test
    void insert() {
        tree.insert(1);

        assertTrue(tree.search(1));
        assertTrue(tree.delete(1));
    }

    @Test
    void search() {
    }

    @Test
    void delete() {
    }
}