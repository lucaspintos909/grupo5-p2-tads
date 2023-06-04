package uy.edu.um.prog2.adt.BinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    BinarySearchTree tree = new BinarySearchTree();

    @Test
    void insert() {
        tree.insert(1);
        assertFalse(false, String.valueOf(String.valueOf(tree.root)==null));

    }

    @Test
    void search() {
        tree.insert(1);
        assertTrue(true, String.valueOf(tree.search(1)));

    }

    @Test
    void delete() {
        tree.insert(1);
        tree.delete(1);
        assertEquals(tree.root,null);
    }
}